package com.jb.service.item;

import com.jb.mapper.item.ItemMapper;
import com.jb.model.CustomMadePr;
import com.jb.model.TMaterial;
import com.jb.model.item.TChannel;
import com.jb.model.item.*;
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
    public PageResult queryitem(Integer page, Integer rows, CustomMadePr pageBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> params = new HashMap<>();
        params.put("pageBean", pageBean);
        int count = itemMapper.queryitemCount(params);
        pageResult.setTotal(count);
        PageUtil<Object> pageUtil = new PageUtil<>(count, page, rows);
        params.put("startIndex",pageUtil.getStartIndex());
        params.put("endIndex",pageUtil.getEndIndex());
        List<CustomMadePr> list =itemMapper.queryitemList(params);
        pageResult.setRows(list);
        return pageResult;
    }

    @Override
    public List<TChannel> queryTChannelEg() {
        return itemMapper.queryTChannelEg();
    }

    @Override
    public List<CustomizedProductCategories> queryCategories(String pid) {
        return itemMapper.queryCategories(pid);
    }

    @Override
    public PageResult querymaterials(Integer page, Integer rows, TMaterial tMaterials) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> params = new HashMap<>();
        params.put("tMaterials", tMaterials);
        int count = itemMapper.querymaterialsCount(params);
        pageResult.setTotal(count);
        PageUtil<Object> pageUtil = new PageUtil<>(count, page, rows);
        params.put("startIndex",pageUtil.getStartIndex());
        params.put("endIndex",pageUtil.getEndIndex());
        List<TMaterial> list =itemMapper.querymaterialsList(params);
        pageResult.setRows(list);
        return pageResult;
    }

    @Override
    public List<TSupplies> queryTSuppliesById(String id) {
        return itemMapper.queryTSuppliesById(id);
    }

    @Override
    public void updatestarStatus(CustomMadePr pageBean) {
        itemMapper.updatestarStatus(pageBean);
    }


}
