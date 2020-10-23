package com.trovy.health.service;

import com.trovy.health.pojo.CheckItem;

import java.util.List;

/**
 * @Author: Trovy
 * @Date: 2020/10/23 10:08
 */
public interface CheckItemService {

    /**
     * 查询所有检查项
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 添加检查项
     * @param checkItem
     */
    void add(CheckItem checkItem);
}
