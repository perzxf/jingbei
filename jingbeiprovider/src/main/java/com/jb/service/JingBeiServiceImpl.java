package com.jb.service;

import com.jb.mapper.JingBeiMapper;
import com.jb.model.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JingBeiServiceImpl implements JingBeiService {
    @Autowired
    private JingBeiMapper jingBeiMapper;

    /**
     * 测试查询
     * @return
     */
    @Override
    public List<TestBean> queryTest() {
        return jingBeiMapper.queryTest();
    }
}
