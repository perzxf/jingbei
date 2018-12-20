package com.jb.controller;

import com.jb.model.CustomMadePr;
import com.jb.model.SuppiyFacilitator;
import com.jb.model.TestBean;
import com.jb.service.JingBeiApiService;
import com.jb.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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

    //图片上传
    @RequestMapping("upload")
    @ResponseBody
    public HashMap<String, String> upload(MultipartFile img,HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();
        String fileUpload = FileUtil.FileUpload(img, request);
        result.put("img", fileUpload);
        return result;
    }

/*    *//**
     * 上传
     * @param img
     * @param request
     * @return
     *//*
    @RequestMapping("upload")
    @ResponseBody
    public String upload(MultipartFile img, HttpServletRequest request){
        String fileUpload = FileUtil.FileUpload(img, request);
        System.out.println(fileUpload);
        return fileUpload;
    }*/


    /**
     * 上传
     * @param suppiyFacilitator
     * @return
     */
 /*   @RequestMapping("addFolder")
    @ResponseBody
    public Result addFolder(SuppiyFacilitator suppiyFacilitator) {
        return jingBeiApiService.addFolder(suppiyFacilitator);
    }*/

    @RequestMapping("queryCustomMadePrList")
    @ResponseBody
    public PageResult queryCustomMadePrList(PageUtilEasyui<CustomMadePr> pgeUtilEasyui){
        return jingBeiApiService.queryCustomMadePrList(pgeUtilEasyui);
    }

}
