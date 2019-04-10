package com.seckill.dao;

import com.seckill.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface GoodsOpertorDao extends JpaRepository<Goods, Long>, JpaSpecificationExecutor<Goods>, Serializable {

}
