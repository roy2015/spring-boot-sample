package com.roy.controller;

import com.gdy.roy.spring.boot.bean.Student;
import com.roy.helper.RedisUtil;
import com.roy.service.HellWorldService;
import com.roy.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired(required = false)
    private Student student;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private PersonVo person;


    @RequestMapping(value = "getSysinfo")
    String getSysInfo() {
        redisUtil.incr("idGenerater", 10);
        return hellWorldService.sayHello();
    }
}
