package com.hydee.h3.pos.mapper;

import com.hydee.h3.pos.entity.TTransDownConf;

public interface TTransDownConfMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TTransDownConf record);

    int insertSelective(TTransDownConf record);

    TTransDownConf selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTransDownConf record);

    int updateByPrimaryKey(TTransDownConf record);
}