package com.zhong.springbootweb.service;

import com.zhong.springbootweb.entity.Goods;

/**
 * @author ：zhongshunhui
 * @date ：Created in 2022/3/14 10:38
 * 文件说明： </p>
 */
public interface GoodsService {

    Goods queryGoodsById(Integer id);

    int modifyGoodsById(Goods goods);
}
