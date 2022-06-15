package com.deniswen.imserver.config;

import com.deniswen.imserver.listener.ExpirationListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
public class RedisConfig {

    @Resource
    private LettuceConnectionFactory connectionFactory;

    @Resource
    private ExpirationListener expirationListener;


    /**
     * 消息监听容器
     */
    @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer() {

        log.info("初始化redis");
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(expirationListener,new PatternTopic("__keyevent@*__:expired"));
        return container;
    }
}
