package com.myproject.spring.controller;/**
 * @Author: ChenPeng
 * @Date: 2019-09-02 20:28
 * @Version 1.0
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: spring
 * @description:
 * @author: ChenPeng
 * @create: 2019-09-02 20:28
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() { return "index";
    }
}
