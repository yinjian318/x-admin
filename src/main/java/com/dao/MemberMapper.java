package com.dao;

import com.model.Member;

import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(Long memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Long memberid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<Member> selectAll(Member record);
}