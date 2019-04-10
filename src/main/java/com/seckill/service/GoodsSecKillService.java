package com.seckill.service;

import com.seckill.entity.Goods;

/**
 * 秒杀服务
 */
public interface GoodsSecKillService {
    //秒杀
    void kill(Goods goods);
}
