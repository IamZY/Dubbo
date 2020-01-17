package com.ntuzy.gmall.service;


import com.ntuzy.gmall.bean.UserAddress;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/1/17 10:15
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);

}
