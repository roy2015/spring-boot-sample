package com.roy.configuration;

import com.roy.vo.PersonVo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by apple on 2019/8/20.
 */

@Configuration
public class MockBeanConfig {

    @ConditionalOnMissingBean
    @Bean(name = "person")
    public PersonVo mockPersonVo() {
        PersonVo personVo = new PersonVo();
        personVo.setName("123");
        personVo.setAge(20);
        return personVo;
    }
}
