package com.jb.mapper;

import com.jb.model.CustomMadePr;
import com.jb.model.SuppiyFacilitator;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface JingBeiMapper {

    //测试 查询
    List<TestBean> queryTest();

    //上传
    void addFolder(SuppiyFacilitator suppiy);

    //删除
    void deleteSuppiy(String xiangmuid);


    //查询总条数
    int queryCustomMadePrCount(HashMap<String, Object> params);

    //查询
    List<CustomMadePr> queryCustomMadePrList(HashMap<String, Object> params);

}
