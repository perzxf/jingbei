package com.jb.service;

import com.jb.model.CustomMadePr;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     * 定制比价管理（供应商）
     * @param pageUtilEasyui
     * @return
     */
    @RequestMapping("queryPbpaPageListInfo")
    PageResult queryPbpaPageList(PageUtilEasyui<CustomMadePr> pageUtilEasyui);

}
