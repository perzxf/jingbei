package com.jb.service;


import com.jb.mapper.JingBeiMapper;
import com.jb.model.CustomMadePr;
import com.jb.model.SuppiyFacilitator;
import com.jb.model.TestBean;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import com.jb.util.StringUtil;
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
    public void addFolder(SuppiyFacilitator suppiyFacilitator) {
        SuppiyFacilitator suppiy = new SuppiyFacilitator();
        String number = suppiyFacilitator.getText();
        String intNumber = number.substring(0,number.indexOf("."));
        System.out.println(intNumber);
        suppiy.setXiangmuid(StringUtil.getUUId());
        suppiy.setText(intNumber);
        System.out.println(suppiy);
        jingBeiMapper.addFolder(suppiy);
    }

    @Override
    public void deleteSuppiy(SuppiyFacilitator suppiyFacilitator) {
        jingBeiMapper.deleteSuppiy(suppiyFacilitator.getXiangmuid());
    }

    @Override
    public PageResult queryCustomMadePrList(PageUtilEasyui<CustomMadePr> pgeUtilEasyui) {
        //总返回体
        PageResult pageResult = new PageResult();
        //查询参数
        HashMap<String, Object> params = new HashMap<>();
        //查询count
        int count = jingBeiMapper.queryCustomMadePrCount(params);
        //把查询出来的count放到总返回当中
        pageResult.setTotal(count);
        //构建分页工具类
        params.put("startIndex",pgeUtilEasyui.getStartIndex());//当前页
        params.put("rows",pgeUtilEasyui.getRows());//每页几条
        //分页查询列表
        List<CustomMadePr> list = jingBeiMapper.queryCustomMadePrList(params);
        //将查询出来的list放到总返回体重
        pageResult.setRows(list);
        return pageResult;
    }







}
