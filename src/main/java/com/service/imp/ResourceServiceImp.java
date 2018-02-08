package com.service.imp;

import com.dao.ResourceMapper;
import com.model.Resource;
import com.service.ResourceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by YINJIAN on 2018/2/8.
 */
@Service("/ResourceService")
public class ResourceServiceImp implements ResourceService {

    private static final Logger log = Logger.getLogger(MemberServiceImp.class);
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public Resource selectByPrimaryKey(Long resourceId) {
        try{
            log.info("##############开始调用接口resourceMapper.selectByPrimaryKey#################");
            Resource resources = resourceMapper.selectByPrimaryKey(resourceId);
            log.info("##############成功,调用接口resourceMapper.selectByPrimaryKey#################");
            return resources;
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Resource> selectAll(Resource record) {
        try{
            log.info("##############开始调用接口resourceMapper.selectAll#################");
            List<Resource> resourcesList = resourceMapper.selectAll(record);
            log.info("##############成功,调用接口resourceMapper.selectAll#################");
            return resourcesList;
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            return null;
        }
    }

    @Override
    public Resource selectByParentId(Long parentId) {
        try{
            log.info("##############开始调用接口resourceMapper.selectByParentId#################");
            Resource resources = resourceMapper.selectByParentId(parentId);
            log.info("##############成功,调用接口resourceMapper.selectByParentId#################");
            return resources;
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            return null;
        }
    }
}
