package com.xuxiaojie.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xuxiaojie
 * @date 2023/10/24
 **/
@Controller
public class IndexController {


    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "ok";
    }
}

