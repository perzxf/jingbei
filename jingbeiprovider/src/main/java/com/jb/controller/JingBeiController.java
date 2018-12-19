package com.jb.controller;

import com.jb.model.BillOfMaterials;
import com.jb.model.TestBean;
import com.jb.service.JingBeiApiService;
import com.jb.service.JingBeiService;
import org.springframework.beans.factory.annotation.Autowired;
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

}
