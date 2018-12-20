package com.jb.controller.item;

import com.jb.model.item.CustomizedProductCategories;
import com.jb.model.item.PageBean;
import com.jb.model.item.TChannelEg;
import com.jb.service.item.ItemApiService;
import com.jb.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemApiService itemService;



    /**
     * 分页查询定制询价单条件查询
     * @param page
     * @param rows
     * @return
     */
    @PostMapping("queryitem")
    @ResponseBody
    public PageResult queryitem(Integer page , Integer rows,PageBean pageBean){
        pageBean.setPage(page);
        pageBean.setRows(rows);
        return itemService.queryitem(pageBean);
    }

    /**
     * 查询发布定制需求--发布范围
     * @return
     */
    @GetMapping("queryTChannelEg")
    @ResponseBody
    public List<TChannelEg> queryTChannelEg(){
        return itemService.queryTChannelEg();
    }


    @PostMapping("queryCategories")
    @ResponseBody
    public List<CustomizedProductCategories> queryCategories(String pid){
        return itemService.queryCategories(pid);
    }


}
