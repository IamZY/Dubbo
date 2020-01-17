package com.ntuzy.gmall.service.impl;

import com.ntuzy.gmall.bean.UserAddress;
import com.ntuzy.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author IamZY
 * @create 2020/1/17 19:39
 */
public class UserServiceImpl2 implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("-----new----------");
        
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");

        return Arrays.asList(address1, address2);
    }
}
