package com.myproject.spring.Controller;/**
 * @Author: ChenPeng
 * @Date: 2019-09-02 20:28
 * @Version 1.0
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: spring
 * @description:
 * @author: ChenPeng
 * @create: 2019-09-02 20:28
 **/
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
