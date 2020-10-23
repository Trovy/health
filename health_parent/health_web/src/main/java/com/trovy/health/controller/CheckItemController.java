package com.trovy.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.trovy.health.constant.MessageConstant;
import com.trovy.health.entity.Result;
import com.trovy.health.pojo.CheckItem;
import com.trovy.health.service.CheckItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Trovy
 * @Date: 2020/10/23 9:54
 */

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    /**
     * 查询所有的检查项
     *
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll() {
        // 调用服务查询
        List<CheckItem> list = checkItemService.findAll();
        // 封装到Result再返回
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, list);
    }

    /**
     * 添加检查项
     *
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody CheckItem checkItem) {
        // 调用服务添加
        checkItemService.add(checkItem);
        return new Result(true, MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
}
