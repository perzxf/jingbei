package com.jb.mapper;

import com.jb.model.BillOfMaterials;
import com.jb.model.TestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JingBeiMapper {

    List<TestBean> queryTest();

}
