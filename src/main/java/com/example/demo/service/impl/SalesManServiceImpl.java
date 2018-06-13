package com.example.demo.service.impl;

import com.example.demo.domain.SalesMan;
import com.example.demo.mapper.SalesManMapper;
import com.example.demo.service.ISalesManService;
import com.example.demo.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesManServiceImpl implements ISalesManService {
    @Autowired
    private SalesManMapper salesManMapper;

    @Override
    public List<SalesMan> getAll() {
        return salesManMapper.selectAll();
    }

    @Override
    public boolean login(String username, String password) {
        SalesMan salesMan = salesManMapper.getSaleManByUsername(username);
        if (salesMan != null && null != password && password.equals(salesMan.getSpassword())) {
            UserContext.getRequest().getSession().setAttribute("LoginSuccess", "1");
            return true;
        }
        return false;
    }
}
