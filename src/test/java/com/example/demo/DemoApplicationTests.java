package com.example.demo;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.mapper.SalesManMapper;
import com.example.demo.service.IGoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private IGoodsService goodsService;

    @Test
    public void contextLoads() {
        System.out.println(goodsMapper.selectAll());
    }

    @Test
    public void test2() {
        goodsService.getAll().forEach(System.out::println);
    }
}
