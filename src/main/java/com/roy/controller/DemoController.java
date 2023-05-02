package com.roy.controller;

import com.roy.helper.RedisUtil;
import com.roy.service.SystemConfigService;
import com.roy.vo.PersonVo;
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
public class DemoController {
    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "getSysinfo")
    String getSysInfo() {
//        redisUtil.incr("idGenerater", 10); 不用时候注释掉，要用是打开
        return systemConfigService.sayHello();
    }
}
