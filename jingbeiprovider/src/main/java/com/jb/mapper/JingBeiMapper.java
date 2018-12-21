package com.jb.mapper;

import com.jb.model.CustomMadePr;
import com.jb.model.CustomizedProductInformation;
import com.jb.model.InquiryList;
import com.jb.model.TestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface JingBeiMapper {

    List<TestBean> queryTest();

    int queryCustomMadePrPageCount(HashMap<String, Object> params);

    List<CustomMadePr> queryCustomMadePrPageList(HashMap<String, Object> params);

    InquiryList queryInquiryList(InquiryList inquiryList);

    CustomizedProductInformation queryCustomizedProductInformation(CustomizedProductInformation cpi);

}
