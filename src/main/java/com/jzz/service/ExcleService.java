package com.jzz.service;

import com.jzz.mapper.CatagoryMapper;
import com.jzz.pojo.Catagory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcleService {

    @Autowired
    CatagoryMapper catagoryMapper;

    public List<Catagory> findAll() {
        return catagoryMapper.findAll();
    }
}
