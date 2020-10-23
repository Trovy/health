package com.trovy.health.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.trovy.health.dao.CheckItemDao;
import com.trovy.health.pojo.CheckItem;
import com.trovy.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @Author: Trovy
 * @Date: 2020/10/23 10:08
 *
 * interfaceClass 发布服务时使用的接口
 */
@Service(interfaceClass = CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemDao checkItemDao;


    /**
     * 查询所有的检查项
     * @return
     */
    @Override
    public List<CheckItem> findAll() {
        return checkItemDao.findAll();
    }

    /**
     * 添加检查项
     * @param checkItem
     */
    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }

}
