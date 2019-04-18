package com.lihang.chapter42cors.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class CorsController {
    /*
    * 配置跨域：
    * 方法一：直接在方法上加注解
    * */
    @RequestMapping("/")
   // @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        System.out.println("addBook");
        return "receive:"+name;
    }

    @RequestMapping("/{id}")
   //@CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id){
        System.out.println("deleteBook");
        return String.valueOf(id);
    }
}
