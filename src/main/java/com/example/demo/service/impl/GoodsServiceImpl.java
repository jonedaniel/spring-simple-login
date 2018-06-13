package com.example.demo.service.impl;

import com.example.demo.domain.Goods;
import com.example.demo.mapper.GoodsMapper;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getAll() {
        return goodsMapper.selectAll();
    }
}
