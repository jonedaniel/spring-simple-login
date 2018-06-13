package com.example.demo.mapper;

import com.example.demo.domain.SoldDetailList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoldDetailListMapper {
    int insert(SoldDetailList record);

    List<SoldDetailList> selectAll();
}