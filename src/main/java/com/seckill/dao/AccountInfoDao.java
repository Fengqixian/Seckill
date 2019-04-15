package com.seckill.dao;

import com.seckill.entity.AccountInfo;
import org.springframework.data.repository.CrudRepository;


public interface AccountInfoDao extends CrudRepository<AccountInfo,Long> {

    AccountInfo findByAccount(String account);

}
