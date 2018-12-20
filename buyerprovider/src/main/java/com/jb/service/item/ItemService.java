package com.jb.service.item;

import com.jb.model.item.CustomizedProductCategories;
import com.jb.model.item.PageBean;
import com.jb.model.item.TChannelEg;
import com.jb.util.PageResult;

import java.util.List;

public interface ItemService {
    PageResult queryitem(Integer page, Integer rows, PageBean pageBean);

    List<TChannelEg> queryTChannelEg();

    List<CustomizedProductCategories> queryCategories(String pid);
}
