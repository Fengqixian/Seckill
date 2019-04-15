package com.seckill.service;

import java.util.List;

/**
 * 封装RedisTemplate
 */
public interface RedisTemplateService {

    /**
     * 添加一个StringValue
     * @param key
     * @param value
     */
    void saveString(String key,Object value);

    /**
     * 获取一个StringValue
     * @param key
     * @return
     */
    String findString(String key);

    /**
     * 添加一个List
     * @param list
     */
    void saveList(String key,List<Object> list);

    /**
     * 获取一个List
     * @param key
     * @return
     */
    List findList(String key);
}
