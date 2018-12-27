package com.jb.service.item;

import com.jb.model.CustomMadePr;
import com.jb.model.TMaterial;
import com.jb.model.item.*;
import com.jb.util.PageResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("item")
public interface ItemApiService {

    @RequestMapping("queryitemInfo")
    PageResult queryitem(CustomMadePr pageBean);

    @GetMapping("queryTChannelEg")
    List<TChannel> queryTChannelEg();

    @PostMapping("queryCategories")
    List<CustomizedProductCategories> queryCategories(String pid);

    @PostMapping("querymaterials")
    PageResult querymaterials(TMaterial tMaterials);

    @PostMapping("queryTSuppliesById")
    List<TSupplies> queryTSuppliesById(String id);

    @PutMapping("updatestarStatus")
    void updatestarStatus(CustomMadePr pageBean);
}
