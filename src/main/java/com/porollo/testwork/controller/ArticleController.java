package com.porollo.testwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    @RequestMapping(value = "/")
    public String index() {
        return "article";
    }

}
