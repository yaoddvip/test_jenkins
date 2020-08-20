package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 *
 * @author yaodd
 * @date 2020/8/20
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
