package com.jb.service.material;

import com.jb.model.BillOfMaterials;
import com.jb.util.PageResult;
import com.jb.util.PageUtilEasyui;

import java.util.HashMap;
import java.util.List;

public interface MaterialService {
    PageResult queryMaterial(PageUtilEasyui<BillOfMaterials> pageUtilEasyui);

    List<BillOfMaterials> queryMaterials();
}
