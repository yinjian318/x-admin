package com.service.imp;

import com.dao.MemberMapper;
import com.model.Member;
import com.service.MemberService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by YINJIAN on 2018/2/5.
 */
@Service("/MemberService")
public class MemberServiceImp implements MemberService {
    private static final Logger log = Logger.getLogger(MemberServiceImp.class);
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Map<String, Object> updateByPrimaryKey() {
        return null;
    }

    @Override
    public Member selectByPrimaryKey(Long memberid) {
        return null;
    }

    @Override
    public List<Member> selectAll(Member record) {
        try{
            log.info("##############开始调用接口memberMapper.selectAll#################");
            List<Member> memberList = memberMapper.selectAll(record);
            log.info("##############成功,调用接口memberMapper.selectAll#################");
            return memberList;
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            return null;
        }

    }
}
