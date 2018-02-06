package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Member;
import com.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by YINJIAN on 2018/2/5.
 */
@Controller
@RequestMapping("member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("queryMemberList")
    public String selectMemberAll(Member member,ModelMap model,int pageNum){
        int pageSize=10;
        PageHelper.startPage(pageNum, pageSize);
        //紧跟着的第一个select方法会被分页
        List<Member> memberList = memberService.selectAll(member);
        PageInfo<Member> pageInfo = new PageInfo<>(memberList);
        model.addAttribute("memberList",memberList);
        model.addAttribute("pageInfo",pageInfo);
       // model.addAttribute("total",pageInfo.getTotal());
        return "member/memberList";
    }
}
