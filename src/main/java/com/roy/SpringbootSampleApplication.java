package com.roy;

import com.gdy.roy.spring.boot.annotation.EnableRoyConfiguration;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
@EnableRoyConfiguration
public class SpringbootSampleApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootSampleApplication.class, args);
    }
}