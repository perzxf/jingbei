package com.jb.controller;

import com.jb.model.CustomMadePr;
import com.jb.model.CustomizedProductInformation;
import com.jb.model.InquiryList;
import com.jb.model.TestBean;
import com.jb.service.JingBeiApiService;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
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

    /**
     * D-1定制比价管理（供应商）
     * @param pageUtilEasyui
     * @param customMadePr
     * @return
     */
    @RequestMapping("queryPbpaPageList")
    @ResponseBody
    public PageResult queryPbpaPageList(PageUtilEasyui<CustomMadePr> pageUtilEasyui, CustomMadePr customMadePr){
        pageUtilEasyui.setT(customMadePr);
        return jingBeiApiService.queryPbpaPageList(pageUtilEasyui);
    }

    /**
     * 项目详情页询价单 D-1-1
     */
    @RequestMapping("queryInquiryList")
    @ResponseBody
    public InquiryList queryInquiryList(InquiryList inquiryList){
        return jingBeiApiService.queryInquiryList(inquiryList);
    }

    /**
     * 项目详情页定制产品信息 D-1-1
     */
    @RequestMapping("queryCustomizedProductInformation")
    @ResponseBody
    public CustomizedProductInformation queryCustomizedProductInformation(CustomizedProductInformation cpi){
        return jingBeiApiService.queryCustomizedProductInformation(cpi);
    }


}
