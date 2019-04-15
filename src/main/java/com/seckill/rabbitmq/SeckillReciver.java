package com.seckill.rabbitmq;

import com.seckill.entity.SecKillInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SeckillReciver {
    private static final Logger log = LoggerFactory.getLogger(SeckillReciver.class);

    public void process(SecKillInfo secKillInfo){
        log.info("用户："+secKillInfo.getAccountInfo().getUsername()+"("+secKillInfo.getAccountInfo().getAccount()+")");
        log.info("账户余额："+secKillInfo.getAccountInfo().getBalance());
        log.info("秒杀商品："+secKillInfo.getGoods().getGoodsName());
        log.info("秒杀单价："+secKillInfo.getGoods().getGoodsPrice());
    }
}
