package com.seckill.entity;

import javax.persistence.*;

/**
 * 商品
 */
@Entity
@Table(name="T_Goods",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = {"goodsCode"})
        },
        indexes = {@Index(columnList = "goodsCode"),@Index(columnList = "goodsName" )})
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodsId;
    //商品名称
    @Column
    private String goodsName;
    //商品编码
    @Column
    private String goodsCode;
    //商品库存
    @Column
    private Integer goodsInventory;
    //商品单价
    @Column
    private float goodsPrice;
    //商品状态 0 正常 1 秒杀 2关闭
    @Column(insertable = false,columnDefinition = "int default 0")
    private Integer goodsState;

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public float getGoodsPrice() {
        return goodsPrice;
    }
}
