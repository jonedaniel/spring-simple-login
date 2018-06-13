package com.example.demo.mapper;

import com.example.demo.domain.SalesMan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesManMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(SalesMan record);

    SalesMan selectByPrimaryKey(Integer sid);

    List<SalesMan> selectAll();

    int updateByPrimaryKey(SalesMan record);

    SalesMan getSaleManByUsername(String username);
}