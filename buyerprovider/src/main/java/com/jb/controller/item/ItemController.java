package com.jb.controller.item;

import com.jb.model.CustomMadePr;
import com.jb.model.TMaterial;
import com.jb.model.item.TChannel;
import com.jb.model.item.*;
import com.jb.service.item.ItemApiService;
import com.jb.service.item.ItemService;
import com.jb.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController implements ItemApiService {

    @Autowired
    private ItemService itemService;


    @Override
    public PageResult queryitem(@RequestBody CustomMadePr pageBean) {
        return itemService.queryitem(pageBean.getPage(),pageBean.getRows(),pageBean);
    }

    @Override
    public List<TChannel> queryTChannelEg() {
        return itemService.queryTChannelEg();
    }

    @Override
    public List<CustomizedProductCategories> queryCategories(@RequestBody  String pid) {
        return itemService.queryCategories(pid);
    }

    @Override
    public PageResult querymaterials(@RequestBody TMaterial tMaterials) {
        return itemService.querymaterials(tMaterials.getPage(),tMaterials.getRows(),tMaterials);
    }

    @Override
    public List<TSupplies> queryTSuppliesById(@RequestBody String id) {
        return itemService.queryTSuppliesById(id);
    }

    @Override
    public void updatestarStatus(@RequestBody CustomMadePr pageBean) {
        itemService.updatestarStatus(pageBean);
    }


}
