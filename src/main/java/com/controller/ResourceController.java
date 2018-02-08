package com.controller;

import com.model.Resource;
import com.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by YINJIAN on 2018/2/8.
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    /**
     * 菜单显示
     * @param model
     * @param resource
     * @return
     */
    @RequestMapping("/searchResource")
    public String searchResource(Model model, Resource resource){
        List<Resource> parentList = new LinkedList<>();//模块
        List<Resource> childrenListTemp = new LinkedList<>();
        List<Resource> childrenList = new LinkedList<>();//第二级菜单
        List<Resource> resourceList = resourceService.selectAll(resource);
        if(null != resourceList){
            for (Resource  resource1 :resourceList) {
                if (null == resource1.getParentId() || "".equals(resource1.getParentId())){
                    parentList.add(resource1);
                }else{
                    childrenListTemp.add(resource1);
                }
            }
            for (Resource resource2: parentList) {
                for (Resource resource3: childrenListTemp) {
                    if (resource2.getResourceId() == resource3.getParentId()){
                        childrenList.add(resource3);
                    }
                }
            }
        }
        model.addAttribute("resourceList",resourceList);
        model.addAttribute("parentList",parentList);
        model.addAttribute("childrenList",childrenList);
        return "index";
    }

}
