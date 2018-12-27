package com.jb.service;

import com.jb.mapper.JingBeiMapper;
import com.jb.model.CustomMadePr;
import com.jb.model.CustomizedProductInformation;
import com.jb.model.InquiryList;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class JingBeiServiceImpl implements JingBeiService {
    @Autowired
    private JingBeiMapper jingBeiMapper;

    /**
     * 测试查询
     * @return
     */
    @Override
    public List<TestBean> queryTest() {
        return jingBeiMapper.queryTest();
    }

    @Override
    public PageResult queryPbpaPageList(PageUtilEasyui<CustomMadePr> pageUtilEasyui) {
        //总返回体
        PageResult pageResult = new PageResult();
        //查询参数
        HashMap<String, Object> params = new HashMap<>();
        params.put("customMadePr",pageUtilEasyui.getT());
        //查询count
        int count = jingBeiMapper.queryCustomMadePrPageCount(params);
        //把查询出来的count放到总返回当中
        pageResult.setTotal(count);
        //构建分页工具类
        params.put("startIndex",pageUtilEasyui.getStartIndex());//当前页
        params.put("rows",pageUtilEasyui.getRows());//每页几条
        //分页查询列表
        List<CustomMadePr> list = jingBeiMapper.queryCustomMadePrPageList(params);
        //将查询出来的list放到总返回体重
        pageResult.setRows(list);
        return pageResult;
    }

    @Override
    public InquiryList queryInquiryList(InquiryList inquiryList) {
        return jingBeiMapper.queryInquiryList(inquiryList);
    }

    @Override
    public CustomizedProductInformation queryCustomizedProductInformation(CustomizedProductInformation cpi) {
        return jingBeiMapper.queryCustomizedProductInformation(cpi);
    }
}
