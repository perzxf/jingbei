package com.jb.controller.item;

import com.alibaba.fastjson.JSON;
import com.jb.model.CustomMadePr;
import com.jb.model.TMaterial;
import com.jb.model.item.*;
import com.jb.service.item.ItemApiService;
import com.jb.util.JsonUtils;
import com.jb.util.PageResult;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class ItemController {

    @Autowired
    private ItemApiService itemService;

    @Autowired
    protected RedisTemplate<String, String> redisTemplate;



    /**
     * 分页查询定制询价单条件查询
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("queryitem")
    @ResponseBody
    public PageResult queryitem(Integer page , Integer rows, CustomMadePr pageBean){
        pageBean.setPage(page);
        pageBean.setRows(rows);
        return itemService.queryitem(pageBean);
    }


    /**
     * 分页查询我的材料单条件查询
     * @param page
     * @param rows
     * @param tMaterials
     * @return
     */
    @PostMapping("querymaterials")
    @ResponseBody
    public PageResult querymaterials(Integer page , Integer rows, TMaterial tMaterials){
        tMaterials.setPage(page);
        tMaterials.setRows(rows);
        return itemService.querymaterials(tMaterials);
    }



    /**
     * 查询发布定制需求--发布范围
     * @return
     */
    @GetMapping("queryTChannelEg")
    @ResponseBody
    public List<TChannel> queryTChannelEg(){
        return itemService.queryTChannelEg();
    }

    /**
     * 查询发布定制需求--所属类目
     * @param pid
     * @return
     */
    @PostMapping("queryCategories")
    @ResponseBody
    public List<CustomizedProductCategories> queryCategories(String pid){
        return itemService.queryCategories(pid);
    }

    /**
     * 查看材料单
     * @param Id
     * @return
     */
    @PostMapping("queryTSuppliesById")
    @ResponseBody
    public List<TSupplies> queryTSuppliesById(String id){
        return itemService.queryTSuppliesById(id);
    }


    /**
     * 取消询价单   3
     * @param pageBean
     */
    @PutMapping("updatestarStatus")
    @ResponseBody
    public void updatestarStatus (CustomMadePr pageBean){
        itemService.updatestarStatus(pageBean);
    }

/*
    @PostMapping("querypageBeanRedis")
    @ResponseBody
    public List<TChannel> querypageBeanRedis(){
        //缓存key
        String cacheKey = "redisSet11";
        //查询缓存中是否有该缓存
        String cacheValue =redisTemplate.opsForValue().get(cacheKey);
        //如果有  怎么办  (则把缓存中的数据取出即可)
        if(StringUtils.isNotEmpty(cacheValue)){
            System.out.println("走缓存了");
            List<TChannel> test= JSON.parseArray(cacheValue,TChannel.class);
            return test;
        }else{  //如果没有 怎么办 (去数据库查询并缓存到redis中)
            System.out.println("没走缓存");
            List<TChannel> testBeans = itemService.queryTChannelEg();
            String jsonString = JSON.toJSONString(testBeans);
            //缓存数据到redis中
            redisTemplate.opsForValue().set(cacheKey, jsonString);
            //设置权限缓存的过期时间 30分钟
            redisTemplate.expire(cacheKey,30, TimeUnit.MINUTES);
            return testBeans;
        }
    }
    */

    @PostMapping("addcustomized")
    @ResponseBody
    public Boolean  addcustomized(PageBean pageBean){
        //缓存key
        String cacheKey = "pageBean11111";

        try {
            String jsonString = JSON.toJSONString(pageBean);
            //缓存数据到redis中
            redisTemplate.opsForValue().set(cacheKey, jsonString);
            //设置权限缓存的过期时间 30分钟
            redisTemplate.expire(cacheKey,30, TimeUnit.HOURS);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    @GetMapping("edcustomized")
    @ResponseBody
    public PageBean  edcustomized(){
        //缓存key
        String cacheKey = "pageBean11111";
        String cacheValue =redisTemplate.opsForValue().get(cacheKey);
            //将JSON数组转换为字符串
            PageBean parseArray = JsonUtils.jsonToPojo(cacheValue, PageBean.class);
            return parseArray;
    }



    @PostMapping("addcustomized2")
    @ResponseBody
    public Boolean  addcustomized2(PageBean pageBean){
        //缓存key
        String cacheKey = "pageBean22222";
        try {
            String jsonString = JSON.toJSONString(pageBean);
            //缓存数据到redis中
            redisTemplate.opsForValue().set(cacheKey, jsonString);
            //设置权限缓存的过期时间 30分钟
            redisTemplate.expire(cacheKey,30, TimeUnit.HOURS);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @PostMapping("add1")
    @ResponseBody
    public String add1(TZong tZong){
        //缓存key
        String cacheKey = "add1";
            String jsonString = JSON.toJSONString(tZong);
            //缓存数据到redis中
            redisTemplate.opsForValue().set(cacheKey, jsonString);
            //设置权限缓存的过期时间 30分钟
            redisTemplate.expire(cacheKey,30, TimeUnit.HOURS);
            return "1";
        }

    }











