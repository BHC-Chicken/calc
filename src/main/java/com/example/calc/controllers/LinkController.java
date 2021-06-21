package com.example.calc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/link")
public class LinkController {

    @RequestMapping(value = "/norm")
    public String normGet() {
        return "/WEB-INF/views/link.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/body")
    public String bodyGet() {
        return "/WEB-INF/views/body.jsp";
    }
}
