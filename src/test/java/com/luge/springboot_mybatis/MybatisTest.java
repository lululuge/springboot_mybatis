package com.luge.springboot_mybatis;

import com.luge.SpringbootMybatisApplication;
import com.luge.dao.UserDao;
import com.luge.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testFindAll() {
        List<User> users = userDao.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setName("luzan");
        user.setUsername("root");
        user.setPassword("root");
        userDao.insert(user);
    }
}
