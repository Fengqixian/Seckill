package com.seckill.entity;

/**
 * 秒杀Entity
 */
public class SecKillInfo {

    private Integer killStatus;//秒杀状态
    private AccountInfo accountInfo;//用户
    private Goods goods;//商品

    public void setKillStatus(Integer killStatus) {
        this.killStatus = killStatus;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getKillStatus() {
        return killStatus;
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public Goods getGoods() {
        return goods;
    }
}
