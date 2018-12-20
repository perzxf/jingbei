package com.jb.mapper.item;

import com.jb.model.item.CustomizedProductCategories;
import com.jb.model.item.TChannelEg;
import com.jb.model.item.TItemEnquiry;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ItemMapper {
    int queryitemCount(HashMap<String, Object> params);

    List<TItemEnquiry> queryitemList(HashMap<String, Object> params);

    List<TChannelEg> queryTChannelEg();

    List<CustomizedProductCategories> queryCategories(String pid);
}
