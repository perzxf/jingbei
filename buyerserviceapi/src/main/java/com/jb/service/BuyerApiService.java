package com.jb.service;

import com.jb.model.TestBean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("buyer")
public interface BuyerApiService {
    /**
     * 测试查询
     * @return
     */
    @RequestMapping("queryBuyerTestInfo")
    List<TestBean> queryBuyerTest();
}
