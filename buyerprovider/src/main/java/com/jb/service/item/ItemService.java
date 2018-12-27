package com.jb.service.item;

import com.jb.model.CustomMadePr;
import com.jb.model.TMaterial;
import com.jb.model.item.TChannel;
import com.jb.model.item.*;
import com.jb.util.PageResult;

import java.util.List;

public interface ItemService {
    PageResult queryitem(Integer page, Integer rows, CustomMadePr pageBean);

    List<TChannel> queryTChannelEg();

    List<CustomizedProductCategories> queryCategories(String pid);

    PageResult querymaterials(Integer page, Integer rows, TMaterial tMaterials);

    List<TSupplies> queryTSuppliesById(String id);

    void updatestarStatus(CustomMadePr pageBean);
}
