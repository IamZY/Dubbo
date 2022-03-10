package com.ntuzy.dubbo.service.impl;

import com.ntuzy.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public String hello(String msg) {
        return "hello" + msg;
    }
}
