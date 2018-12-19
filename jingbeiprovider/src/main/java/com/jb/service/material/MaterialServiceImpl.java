package com.jb.service.material;

import com.jb.mapper.material.MaterialMapper;
import com.jb.model.BillOfMaterials;
import com.jb.util.PageResult;
import com.jb.util.PageUtil;
import com.jb.util.PageUtilEasyui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public PageResult queryMaterial(PageUtilEasyui<BillOfMaterials> pageUtilEasyui) {
        //总返回体
        PageResult pageResult = new PageResult();
        //查询参数
        HashMap<String, Object> params = new HashMap<>();
        //查询count
        int count = materialMapper.queryMaterialPageCount(params);
        //把查询出来的count放到总返回当中
        pageResult.setTotal(count);
        //构建分页工具类
        params.put("startIndex",pageUtilEasyui.getStartIndex());//当前页
        params.put("rows",pageUtilEasyui.getRows());//每页几条
        //分页查询列表queryUserByAccount
        List<BillOfMaterials> list = materialMapper.queryMaterialPageList(params);
        //将查询出来的list放到总返回体重
        pageResult.setRows(list);
        return pageResult;
    }

    @Override
    public List<BillOfMaterials> queryMaterials() {
        return materialMapper.queryMaterials();
    }


}
