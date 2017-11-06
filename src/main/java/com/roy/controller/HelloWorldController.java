package com.roy.controller;

import com.roy.service.HellWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: BG244210
 * Date: 06/11/2017
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @Autowired
    private HellWorldService hellWorldService;


    @RequestMapping(value = "getSysinfo")
    String getSysInfo() {
        return hellWorldService.sayHello();
    }
}
