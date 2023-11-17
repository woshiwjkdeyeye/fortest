package com.mapper;

import com.Bean.studentBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther hmy
 * @create 2023-11-07-22:05
 */
@Mapper
public interface studentMapper {

    @Select("select * from student")
    @Result(property = "id",column = "编号")
    @Result(property = "name",column = "姓名")
    List<studentBean> getAll();
}
