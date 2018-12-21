package com.jb.service;

import com.jb.model.CustomMadePr;
import com.jb.model.CustomizedProductInformation;
import com.jb.model.InquiryList;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;

import java.util.List;

public interface JingBeiService {
    List<TestBean> queryTest();

    PageResult queryPbpaPageList(PageUtilEasyui<CustomMadePr> pageUtilEasyui);

    InquiryList queryInquiryList(InquiryList inquiryList);

    CustomizedProductInformation queryCustomizedProductInformation(CustomizedProductInformation cpi);

}
