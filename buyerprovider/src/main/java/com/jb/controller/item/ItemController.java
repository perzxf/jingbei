package com.jb.controller.item;

import com.jb.model.item.CustomizedProductCategories;
import com.jb.model.item.PageBean;
import com.jb.model.item.TChannelEg;
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
    public PageResult queryitem(@RequestBody PageBean pageBean) {
        return itemService.queryitem(pageBean.getPage(),pageBean.getRows(),pageBean);
    }

    @Override
    public List<TChannelEg> queryTChannelEg() {
        return itemService.queryTChannelEg();
    }

    @Override
    public List<CustomizedProductCategories> queryCategories(@RequestBody  String pid) {
        return itemService.queryCategories(pid);
    }


}
