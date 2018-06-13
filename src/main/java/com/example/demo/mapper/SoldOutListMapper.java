package com.example.demo.mapper;

import com.example.demo.domain.SoldOutList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoldOutListMapper {
    int insert(SoldOutList record);

    List<SoldOutList> selectAll();
}