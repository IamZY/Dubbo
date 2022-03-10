package com.ntuzy.dubbo.web;

import com.ntuzy.dubbo.service.SomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class SomeController {
    @Resource
    private SomeService someService;
    @RequestMapping(value = "/hello")
    public String hello(Model model){
        String world = someService.hello("world");
        model.addAttribute("hello",world);
        return "hello";
    }

}
