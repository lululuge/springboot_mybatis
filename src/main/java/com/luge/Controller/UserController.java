package com.luge.Controller;

import com.luge.dao.UserDao;
import com.luge.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userDao.selectAll();
        return users;
    }

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "欢迎你！！！";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        User user = new User();
        user.setName("陆昝");
        userDao.insert(user);
        return "保存成功！";
    }
}
