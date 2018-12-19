package com.jb.service.material;

import com.jb.model.BillOfMaterials;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("material")
public interface MaterialApiService {


    /**
     * 材料单查询
     */
    @RequestMapping("queryMaterial")
    PageResult queryMaterial(PageUtilEasyui<BillOfMaterials> pageUtilEasyui);

    @RequestMapping("queryMaterials")
    List<BillOfMaterials> queryMaterials();
}
