package com.jb.service;

import com.jb.model.CustomMadePr;
import com.jb.model.SuppiyFacilitator;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;

import java.util.List;

public interface JingBeiService {
    List<TestBean> queryTest();

    //上传
    void addFolder(SuppiyFacilitator suppiyFacilitator);

    //删除
    void deleteSuppiy(SuppiyFacilitator suppiyFacilitator);

    //查询
    PageResult queryCustomMadePrList(PageUtilEasyui<CustomMadePr> pgeUtilEasyui);

}
