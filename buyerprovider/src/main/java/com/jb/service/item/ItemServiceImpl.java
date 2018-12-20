package com.jb.service.item;

import com.jb.mapper.item.ItemMapper;
import com.jb.model.item.CustomizedProductCategories;
import com.jb.model.item.PageBean;
import com.jb.model.item.TChannelEg;
import com.jb.model.item.TItemEnquiry;
import com.jb.util.PageResult;
import com.jb.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public PageResult queryitem(Integer page, Integer rows, PageBean pageBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> params = new HashMap<>();
        params.put("pageBean", pageBean);
        int count = itemMapper.queryitemCount(params);
        pageResult.setTotal(count);
        PageUtil<Object> pageUtil = new PageUtil<>(count, page, rows);
        params.put("startIndex",pageUtil.getStartIndex());
        params.put("endIndex",pageUtil.getEndIndex());
        List<TItemEnquiry> list =itemMapper.queryitemList(params);
        pageResult.setRows(list);
        return pageResult;
    }

    @Override
    public List<TChannelEg> queryTChannelEg() {
        return itemMapper.queryTChannelEg();
    }

    @Override
    public List<CustomizedProductCategories> queryCategories(String pid) {
        return itemMapper.queryCategories(pid);
    }


}
