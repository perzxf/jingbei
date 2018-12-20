package com.jb.service.item;

import com.jb.model.item.CustomizedProductCategories;
import com.jb.model.item.PageBean;
import com.jb.model.item.TChannelEg;
import com.jb.util.PageResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("item")
public interface ItemApiService {

    @PostMapping("queryitemInfo")
    PageResult queryitem(PageBean pageBean);

    @GetMapping("queryTChannelEg")
    List<TChannelEg> queryTChannelEg();

    @PostMapping("queryCategories")
    List<CustomizedProductCategories> queryCategories(String pid);
}
