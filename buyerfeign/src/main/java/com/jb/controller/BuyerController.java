package com.jb.controller;

import com.jb.model.TestBean;
import com.jb.service.BuyerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BuyerController  {
    @Autowired
    private BuyerApiService buyerApiService;

    /**
     * 测试查询
     * @return
     */
    @RequestMapping("queryBuyerTest")
    @ResponseBody
    public List<TestBean> queryBuyerTest(){
        return buyerApiService.queryBuyerTest();
    }
}
