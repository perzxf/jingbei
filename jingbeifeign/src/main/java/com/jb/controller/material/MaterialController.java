package com.jb.controller.material;

import com.jb.model.BillOfMaterials;
import com.jb.service.material.MaterialApiService;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MaterialController {

    @Autowired
    private MaterialApiService materialApiService;


    /**
     * 材料单查询
     * BillOfMaterials 材料单表
     * material  材料
     */
    @RequestMapping("queryMaterial")
    @ResponseBody
    public PageResult queryMaterial(PageUtilEasyui<BillOfMaterials> pageUtilEasyui){
        return materialApiService.queryMaterial(pageUtilEasyui);
    }

    @RequestMapping("queryMaterials")
    @ResponseBody
    public List<BillOfMaterials>queryMaterials(){
        return materialApiService.queryMaterials();
    }


}
