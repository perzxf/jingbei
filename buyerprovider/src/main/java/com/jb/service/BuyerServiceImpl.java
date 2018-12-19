package com.jb.service;

import com.jb.mapper.BuyerMapper;
import com.jb.model.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;
    /**
     * 测试查询
     * @return
     */
    @Override
    public List<TestBean> queryBuyerTest() {
        return buyerMapper.queryBuyerTest();
    }
}
