package com.jb.mapper.item;

import com.jb.model.CustomMadePr;
import com.jb.model.TMaterial;
import com.jb.model.item.TChannel;
import com.jb.model.item.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ItemMapper {
    int queryitemCount(HashMap<String, Object> params);

    List<CustomMadePr> queryitemList(HashMap<String, Object> params);

    List<TChannel> queryTChannelEg();

    List<CustomizedProductCategories> queryCategories(String pid);

    int querymaterialsCount(HashMap<String, Object> params);

    List<TMaterial> querymaterialsList(HashMap<String, Object> params);

    List<TSupplies> queryTSuppliesById(String id);

    void updatestarStatus(CustomMadePr pageBean);
}
