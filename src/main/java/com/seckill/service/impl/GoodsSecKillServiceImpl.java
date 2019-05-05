package com.seckill.service.impl;

import com.seckill.dao.GoodsOpertorDao;
import com.seckill.entity.Goods;
import com.seckill.service.GoodsSecKillService;

import com.seckill.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSecKillServiceImpl implements GoodsSecKillService {

    @Autowired
    private GoodsOpertorDao goodsOpertorDao;

    @Autowired
    private RedisTemplateService redisTemplateService;

    @Override
    public Goods kill(Goods goods) {
        return goodsOpertorDao.save(goods);
    }

    @Override
    public List<Goods> findAllGoods() {
        List<Goods> goodsList =goodsOpertorDao.findAll();
        return goodsList;
    }

    @Override
    public Goods findGoods(String goodsCode) {

        return goodsOpertorDao.findByGoodsCode(goodsCode);
    }
}
