package com.service;

import com.model.Member;

import java.util.List;
import java.util.Map;

/**
 * Created by YINJIAN on 2018/2/5.
 */
public interface MemberService {
    Map<String,Object> updateByPrimaryKey();
    Member selectByPrimaryKey(Long memberid);
    List<Member> selectAll(Member record);
}
