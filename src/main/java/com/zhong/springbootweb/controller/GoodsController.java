package com.zhong.springbootweb.controller;

import com.zhong.springbootweb.entity.Goods;
import com.zhong.springbootweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：zhongshunhui
 * @date ：Created in 2022/3/14 10:41
 * 文件说明： </p>
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/goods")
    public @ResponseBody Object selectGoods(@RequestParam int id){
        Goods goods = goodsService.queryGoodsById(id);

        return goods;
    }

    @RequestMapping(value = "/modifygoods")
    public @ResponseBody Object modifyGoods(){
        int count = 0;
        try{
            Goods goods = new Goods();
            goods.setId(1002);
            goods.setName("榆木");
            goods.setAmount(30);
            goods.setPrice(Float.parseFloat("1024"));
            count = goodsService.modifyGoodsById(goods);
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
        return count;
    }

}
