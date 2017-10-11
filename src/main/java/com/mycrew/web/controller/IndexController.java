package com.mycrew.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francis on 10/11/17.
 */
@Controller
public class IndexController {
    private static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index(){
        LOGGER.info("index()");
        System.out.println("index()");
        return "index";
    }

    @RequestMapping("/show")
    public String showIndex(){
        LOGGER.info("showIndex()");
        return "index";
    }
}
