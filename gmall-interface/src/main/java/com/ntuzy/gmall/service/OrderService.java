package com.ntuzy.gmall.service;

import com.ntuzy.gmall.bean.UserAddress;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/1/17 10:22
 */
public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
