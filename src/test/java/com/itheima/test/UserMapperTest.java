package com.itheima.test;


import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.hibernate.validator.constraints.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void mysqltest(){
        List<User> list = userMapper.findall();
        System.out.println(list);
    }
}
