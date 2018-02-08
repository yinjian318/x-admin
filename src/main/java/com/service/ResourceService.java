package com.service;

import com.model.Resource;

import java.util.List;

/**
 * Created by YINJIAN on 2018/2/8.
 */
public interface ResourceService {


    Resource selectByPrimaryKey(Long resourceId);

    List<Resource> selectAll(Resource record);

    Resource selectByParentId(Long parentId);

}
