package com.ntuzy.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ntuzy.gmall.bean.UserAddress;
import com.ntuzy.gmall.service.OrderService;
import com.ntuzy.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 将服务提供者注册到注册中心
 * 导入Dubbo Zookeeper
 * 配置服务提供者
 * <p>
 * 让服务消费者去注册中心订阅服务提供者的服务地址
 *
 * @Author IamZY
 * @create 2020/1/17 10:23
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println(userId);

        // 查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
