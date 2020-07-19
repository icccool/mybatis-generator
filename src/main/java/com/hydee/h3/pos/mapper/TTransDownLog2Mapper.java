package com.hydee.h3.pos.mapper;

import com.hydee.h3.pos.entity.TTransDownLog2;

public interface TTransDownLog2Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(TTransDownLog2 record);

    int insertSelective(TTransDownLog2 record);

    TTransDownLog2 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTransDownLog2 record);

    int updateByPrimaryKey(TTransDownLog2 record);
}