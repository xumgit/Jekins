package com.xum.demo.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class JinkinsController {

    @RequestMapping(value = "/index")
    public String index() {
        return "test/index";
    }

}
