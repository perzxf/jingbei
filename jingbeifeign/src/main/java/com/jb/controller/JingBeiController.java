package com.jb.controller;

import com.jb.model.BillOfMaterials;
import com.jb.model.TestBean;
import com.jb.service.JingBeiApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JingBeiController {
    @Autowired
    private JingBeiApiService jingBeiApiService;

    /**
     * 测试查询
     * @return
     */
    @RequestMapping("queryTest")
    @ResponseBody
    public List<TestBean> queryTest(){
        return jingBeiApiService.queryTest();
    }












}
