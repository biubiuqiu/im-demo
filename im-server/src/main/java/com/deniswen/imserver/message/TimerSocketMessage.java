package com.deniswen.imserver.message;

import com.deniswen.imserver.server.WebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deniswen
 * @date 2021/12/1 16:30
 * @description 测试计时器发送
 */
@Component
@Slf4j
public class TimerSocketMessage {

    /**
     * 推送消息到前台
     */
    //@Scheduled(fixedRate = 2000)
    public void SocketMessage(){
        Map<String, Object> maps = new HashMap<>();
        maps.put("type", "sendMessage");
        maps.put("data","11111");
        WebSocketServer.sendInfo(maps);
        log.info("消息发送成功" + maps);
    }
}
