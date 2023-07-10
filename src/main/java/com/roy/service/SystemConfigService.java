package com.roy.service;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: BG244210
 * Date: 06/11/2017
 * Time: 17:15
 * Description:
 */

@Component
public class SystemConfigService {
    public SystemConfigService() {
        int k = 0;
    }

    public String sayHello() {
        return "{\"sessionId\":\"123bacd1\", \"hubId\":1, \"userName\":\"abc\"}";
    }
}
