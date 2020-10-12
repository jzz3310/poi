package com.jzz.mapper;

import com.jzz.pojo.Catagory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatagoryMapper{
   List<Catagory> findAll();

   int insertCategory(Catagory catagory);
}
