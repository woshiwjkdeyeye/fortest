package com.Servlet;

import com.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther hmy
 * @create 2023-11-05-22:09
 */
@Controller
public class html {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    studentService stuMapper;

    @RequestMapping("/abc")
    public String index(){
//        jdbc.func();
        System.out.println(stuMapper.getAll());
//        jdbcTemplate.update("insert into student values(null,1234)");
        return "/index";
    }


}
