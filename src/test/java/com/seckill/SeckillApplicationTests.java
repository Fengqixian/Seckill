package com.seckill;

import com.seckill.dao.GoodsOpertorDao;
import com.seckill.entity.Goods;
import com.seckill.service.GoodsSecKillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillApplicationTests {

    @Autowired
    private GoodsSecKillService goodsSecKillService;
    @Test
    public void contextLoads(){
        Goods goods = new Goods();
        goods.setGoodsName("LG 25寸液晶显示器");
        goods.setGoodsCode("00003");
        goods.setGoodsPrice(1600.00f);
        goods.setGoodsInventory(999);
        goodsSecKillService.kill(goods);
    }

}
