package com.meiyukai.service;

import com.meiyukai.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    /**
     * 查询所有的用户
     */
    List<User> findAllUsers();


}
