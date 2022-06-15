package com.deniswen.imserver.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExpirationListenerExtend extends KeyExpirationEventMessageListener {
    public ExpirationListenerExtend(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }
}
