package com.seckill.controller;

import com.seckill.entity.Goods;
import com.seckill.service.GoodsSecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/goods")
public class GoodsOpertorController {

    @Autowired
    private GoodsSecKillService goodsSecKillService;

    @RequestMapping(name = "/save")
    public String saveGoods(Goods goods){
        Goods rGoods = goodsSecKillService.kill(goods);
        return rGoods.getGoodsName()+"添加成功！";
    }
}
