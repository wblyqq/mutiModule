package com.example.demo.biz;

import com.example.dao.entity.UserDo;
import com.example.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @SuppressWarnings("ALL")
    @Autowired
    UserMapper userMapper;
    @Override
    public String test() {
        UserDo userDo = userMapper.selectById("1");

        return userDo.getUserId()+userDo.getUserName()+userDo.getPassword();
    }
}
