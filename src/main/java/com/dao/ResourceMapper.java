package com.dao;

import com.model.Resource;

import java.util.List;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long resourceId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long resourceId);

    List<Resource> selectAll(Resource record);

    Resource selectByParentId(Long parentId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}