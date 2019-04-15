package com.seckill.service;

import com.seckill.entity.Goods;

import java.util.List;

/**
 * 秒杀服务
 */
public interface GoodsSecKillService {
    /**
     * 秒杀商品
     * @param goods
     * @return
     */
    Goods kill(Goods goods);

    /**
     * 获取所有商品
     * @return
     */
    List<Goods> findAllGoods();

    /**
     * 获取指定商品
     * @param goodsCode
     * @return
     */
    Goods findGoods(String goodsCode);
}
