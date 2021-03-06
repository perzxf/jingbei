package com.jb.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("buyer")
public class BuyerController {
    //注入rabbitMq工具类
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("saveBook")
    public void insertBook(){
        //convertAndSend 向队列发送一个消息 第一个参数为队列名称 第二个参数为队列内容
        Map<String, Object> bookMap = new HashMap<>();
        bookMap.put("bookId","rewr53534531eqwe");
        bookMap.put("bookName","西游记");
        amqpTemplate.convertAndSend("buyqueue", JSON.toJSONString(bookMap));
    }
}
