package com.zhong.springbootweb.mapper;

import com.zhong.springbootweb.entity.Goods;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Mapper 作用：mybatis 自动扫描数据持久层的映射文件
 * 及 DAO 接口的关系
 */
@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}