package com.jb.service;

import com.jb.model.CustomMadePr;
import com.jb.model.CustomizedProductInformation;
import com.jb.model.InquiryList;
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

    /**
     * 项目详情页询价单 D-1-1
     */
    @RequestMapping("queryInquiryListInfo")
    InquiryList queryInquiryList(InquiryList inquiryList);

    /**
     * 项目详情页定制产品信息 D-1-1
     */
    @RequestMapping("queryCustomizedProductInformationInfo")
    CustomizedProductInformation queryCustomizedProductInformation(CustomizedProductInformation cpi);
}
