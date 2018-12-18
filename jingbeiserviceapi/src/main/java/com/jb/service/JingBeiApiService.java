package com.jb.service;

import com.jb.model.TestBean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("jingbei")
public interface JingBeiApiService {
    /**
     * 测试查询
     * @return
     */
    @RequestMapping("queryTestInfo")
    List<TestBean> queryTest();
}
