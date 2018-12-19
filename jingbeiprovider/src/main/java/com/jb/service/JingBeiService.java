package com.jb.service;

import com.jb.model.CustomMadePr;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;

import java.util.List;

public interface JingBeiService {
    List<TestBean> queryTest();

    PageResult queryPbpaPageList(PageUtilEasyui<CustomMadePr> pageUtilEasyui);

}
