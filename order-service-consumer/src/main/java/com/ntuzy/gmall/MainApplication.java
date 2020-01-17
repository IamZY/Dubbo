package com.ntuzy.gmall;

import com.ntuzy.gmall.service.OrderService;
import com.ntuzy.gmall.service.UserService;
import com.ntuzy.gmall.service.impl.OrderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.loading.MLet;
import java.io.IOException;

/**
 * @Author IamZY
 * @create 2020/1/17 11:20
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();
    }
}
