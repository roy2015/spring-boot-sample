package com.roy;

import com.roy.helper.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by apple on 2019/8/21.
 */

@RunWith(SpringRunner.class)
@SpringBootTest/*(classes = {SpringbootSampleApplication.class})*/
public class SpringBootSampleAppTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RedisUtil redisUtil;

    @Test
    //测试 100个线程 setNx看是否有两个true
    public void testOne() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable disLockThread = new Runnable() {
            @Override
            public void run() {
                boolean disLock = redisUtil.setNxExpire("disLock", 30);
                logger.info("{}", disLock);
                if (disLock) {
                    logger.info("==============={}",new Date());
                }
            }
        };

        for (int i = 0; i < 1000; i++) {
            executorService.execute(disLockThread);
        }

        TimeUnit.MINUTES.sleep(1);
    }


}
