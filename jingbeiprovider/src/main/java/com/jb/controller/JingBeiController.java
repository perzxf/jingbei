package com.jb.controller;

import com.jb.model.CustomMadePr;
import com.jb.model.SuppiyFacilitator;
import com.jb.model.TestBean;
import com.jb.service.JingBeiApiService;
import com.jb.service.JingBeiService;
import com.jb.util.JsonUtils;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import com.jb.util.Result;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //JingBeiController  相当于JingBeiApiServiceImpl实现类
public class JingBeiController implements JingBeiApiService {
    @Autowired
    private JingBeiService jingBeiService;

    /**
     * 测试查询
     * @return
     */
    @Override
    public List<TestBean> queryTest() {
        return jingBeiService.queryTest();
    }

    /**
     * 上传
     * 定制比价管理（服务商） 中的 修改方案
     *
     * @param text
     */
    @RabbitListener(queues = "myqueue")
    public void addFolder(String text) {
            SuppiyFacilitator suppiyFacilitator = JsonUtils.jsonToPojo(text, SuppiyFacilitator.class);
            jingBeiService.addFolder(suppiyFacilitator);
    }

    @RabbitListener(queues = "deleSuppiy")
    public void deleteSuppiy(String id){
        SuppiyFacilitator suppiyFacilitator = JsonUtils.jsonToPojo(id, SuppiyFacilitator.class);
        jingBeiService.deleteSuppiy(suppiyFacilitator);
    }

 /*   @Override
    public PageResult queryGoodsBeanList(@RequestBody PageUtilEasyui<SuppiyFacilitator> pgeUtilEasyui) {
        return goodsServices.queryGoodsBeanList(pgeUtilEasyui);
    }*/

    @Override
    public PageResult queryCustomMadePrList(@RequestBody PageUtilEasyui<CustomMadePr> pgeUtilEasyui) {
        System.out.println("111");
        return jingBeiService.queryCustomMadePrList(pgeUtilEasyui);
    }


}
