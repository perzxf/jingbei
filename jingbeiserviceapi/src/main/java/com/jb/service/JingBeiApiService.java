package com.jb.service;

import com.jb.model.CustomMadePr;
import com.jb.model.SuppiyFacilitator;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import com.jb.util.Result;
import org.springframework.web.bind.annotation.RequestBody;
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


    @RequestMapping("queryCustomMadePrInfo")
    PageResult queryCustomMadePrList(PageUtilEasyui<CustomMadePr> pgeUtilEasyui);

    /**
     * 上传
     * @return
     */
  /*  @RequestMapping("addFolder")
    Result addFolder(SuppiyFacilitator suppiyFacilitator);*/
}
