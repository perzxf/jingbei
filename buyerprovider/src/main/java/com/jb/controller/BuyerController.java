package com.jb.controller;

import com.jb.model.TestBean;
import com.jb.service.BuyerApiService;
import com.jb.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //BuyerController  相当于BuyerApiServiceImpl实现类
public class BuyerController implements BuyerApiService {
    @Autowired
    private BuyerService buyerService;
    /**
     * 测试查询
     * @return
     */
    @Override
    public List<TestBean> queryBuyerTest() {
        return buyerService.queryBuyerTest();
    }
}
