package com.dao;

import com.model.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long resourceid);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long resourceid);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}