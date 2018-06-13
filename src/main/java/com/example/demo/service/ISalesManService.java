package com.example.demo.service;

import com.example.demo.domain.SalesMan;

import java.util.List;

public interface ISalesManService {
    List<SalesMan> getAll();

    boolean login(String username, String password);
}
