package com.seckill;

import com.seckill.dao.AccountInfoDao;
import com.seckill.service.GoodsSecKillService;
import com.seckill.service.RedisTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillApplicationTests {

    @Autowired
    private GoodsSecKillService goodsSecKillService;

    @Autowired
    private RedisTemplateService redisTemplateService;
    @Autowired
    private AccountInfoDao accountInfoDao;
    @Test
    public void contextLoads(){
        redisTemplateService.saveString("JdkSerializer","大哥你好啊");


    }

}
