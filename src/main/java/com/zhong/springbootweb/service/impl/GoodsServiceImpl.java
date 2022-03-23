package com.zhong.springbootweb.service.impl;

import com.zhong.springbootweb.entity.Goods;
import com.zhong.springbootweb.mapper.GoodsMapper;
import com.zhong.springbootweb.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：zhongshunhui
 * @date ：Created in 2022/3/14 10:39
 * 文件说明： </p>
 */
@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Goods queryGoodsById(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional//添加该注解说明该方法添加的事务管理
    public int modifyGoodsById(Goods goods) {
        int updateCount = goodsMapper.updateByPrimaryKeySelective(goods);
        log.info("更新结果：" + updateCount);

        int a = 10/0;
        return updateCount;
    }
}
