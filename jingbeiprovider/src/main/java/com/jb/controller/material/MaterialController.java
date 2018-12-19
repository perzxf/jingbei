package com.jb.controller.material;

import com.jb.model.BillOfMaterials;
import com.jb.service.material.MaterialApiService;
import com.jb.service.material.MaterialService;
import com.jb.util.PageResult;
import com.jb.util.PageUtil;
import com.jb.util.PageUtilEasyui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController  //JingBeiController  相当于JingBeiApiServiceImpl实现类
public class MaterialController implements MaterialApiService {


    @Autowired
    private MaterialService materialService;


    /**
     * 材料单查询
     */
    @Override
    public PageResult queryMaterial(@RequestBody PageUtilEasyui<BillOfMaterials> pageUtilEasyui) {
        return materialService.queryMaterial(pageUtilEasyui);
    }

    @Override
    public List<BillOfMaterials> queryMaterials() {
        return materialService.queryMaterials();
    }


}

