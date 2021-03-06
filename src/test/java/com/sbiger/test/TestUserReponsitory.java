package com.sbiger.test;

import com.sbiger.entity.User;
import com.sbiger.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by sbiger on 2016-11-25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TestUserReponsitory {
    @Resource
    private UserService userService;

    @Test
    public void testFindAll() throws Exception{
        Page<User> list = userService.findAll();
        User user = list.iterator().next();
        System.out.println(user.getName());
    }
}
