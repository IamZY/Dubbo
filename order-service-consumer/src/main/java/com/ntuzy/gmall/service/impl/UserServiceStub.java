package com.ntuzy.gmall.service.impl;

import com.ntuzy.gmall.bean.UserAddress;
import com.ntuzy.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/1/17 19:47
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("------------- UserServiceStub----------------");
        if (!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
