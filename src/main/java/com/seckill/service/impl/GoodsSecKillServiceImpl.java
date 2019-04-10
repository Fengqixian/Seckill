package com.seckill.service.impl;

import com.seckill.dao.GoodsOpertorDao;
import com.seckill.entity.Goods;
import com.seckill.service.GoodsSecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsSecKillServiceImpl implements GoodsSecKillService {

    @Autowired
    private GoodsOpertorDao goodsOpertorDao;
    @Override
    public void kill(Goods goods) {
        goodsOpertorDao.save(goods);
    }
}
