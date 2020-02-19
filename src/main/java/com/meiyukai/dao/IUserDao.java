package com.meiyukai.dao;

import com.meiyukai.domain.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userDao")
@CacheNamespace(blocking = true)
public interface IUserDao {
    /**
     * 查询所有的用户
     */
    @Select(value = "select * from user")
    List<User> findAllUsers();
}
