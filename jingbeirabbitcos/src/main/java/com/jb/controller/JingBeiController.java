package com.jb.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class JingBeiController {

    @RabbitListener(queues = "myqueue")
    public void listenerBookMessage(String message){
        Map map = JSON.parseObject(message, Map.class);
        System.out.println("message = [" + map.toString() + "]");
    }
}
