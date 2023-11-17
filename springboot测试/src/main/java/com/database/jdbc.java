package com.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @auther hmy
 * @create 2023-11-06-16:34
 */
@Service
public class jdbc {

    @Autowired
    static JdbcTemplate jdbcTemplate;

    public static void func(){
        if(jdbcTemplate==null){
            System.out.println("-----------------为空------------------------");
            return;
        }
        System.out.println(jdbcTemplate);
        System.out.println(jdbcTemplate.queryForList("select * from student"));

        System.out.println("执行了");
    }

}
