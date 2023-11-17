package com.service;

import com.Bean.studentBean;
import com.mapper.studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther hmy
 * @create 2023-11-07-22:55
 */
@Service
public class studentService {
    @Autowired
    studentMapper studentMapper;

    public List<studentBean> getAll(){
        return studentMapper.getAll();
    }
}
