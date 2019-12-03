package com.luge.dao;

import com.luge.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserDao extends Mapper<User> {
//    /**
//     * 查询所有用户
//     */
//    public List<User> findAll();
}
