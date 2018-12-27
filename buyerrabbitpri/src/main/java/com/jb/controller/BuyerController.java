package com.jb.controller;

import com.alibaba.fastjson.JSON;
import com.jb.model.item.PageBean;
import com.jb.util.JsonUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("buyer")
public class BuyerController {
    //注入rabbitMq工具类
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    protected RedisTemplate<String, String> redisTemplate;

    @RequestMapping("saveBook")
    public void insertBook(){
        //convertAndSend 向队列发送一个消息 第一个参数为队列名称 第二个参数为队列内容
        Map<String, Object> bookMap = new HashMap<>();
        bookMap.put("bookId","rewr53534531eqwe");
        bookMap.put("bookName","西游记");
        amqpTemplate.convertAndSend("buyqueue", JSON.toJSONString(bookMap));
    }

    @PostMapping("addzong")
    public Boolean addzong(){
        try {
            //缓存key
            String cacheKey = "pageBean11111";
            String cacheKey2 = "pageBean22222";
            String cacheValue =redisTemplate.opsForValue().get(cacheKey);
            String cacheValue2 =redisTemplate.opsForValue().get(cacheKey2);
            //将JSON数组转换为字符串
            PageBean parseArray = JsonUtils.jsonToPojo(cacheValue, PageBean.class);
            PageBean parseArray2 = JsonUtils.jsonToPojo(cacheValue2, PageBean.class);
            PageBean pageBean = new PageBean();
            pageBean.setId(parseArray.getId());
            pageBean.setItemName(parseArray2.getItemName());

            return true;
        }catch (Exception e) {
            return false;
         }


    }
}
