package com.jb.mapper;

import com.jb.model.TestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BuyerMapper {
    List<TestBean> queryBuyerTest();
}
