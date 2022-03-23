package com.zhong.springbootweb.controller;

import com.zhong.springbootweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhongshunhui
 * @date ：Created in 2022/3/14 13:55
 * 文件说明： </p>
 */
//相当于@Controller + @ResponseBody
@RestController
public class GoodsRestController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/queryGoods")
    public Object queryGoods(@RequestParam Integer id){
        return goodsService.queryGoodsById(id);
    }
}
