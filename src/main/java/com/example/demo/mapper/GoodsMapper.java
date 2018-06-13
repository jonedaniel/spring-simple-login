package com.example.demo.mapper;

import com.example.demo.domain.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
}