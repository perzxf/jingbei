package com.jb.mapper.material;


import com.jb.model.BillOfMaterials;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface MaterialMapper {

    int queryMaterialPageCount(HashMap<String, Object> params);

    List<BillOfMaterials> queryMaterialPageList(HashMap<String, Object> params);

    List<BillOfMaterials> queryMaterials();
}
