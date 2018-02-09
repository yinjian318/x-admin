package com.dao;

import com.model.Account;
import org.apache.ibatis.annotations.Param;


public interface AccountMapper {
    int deleteByPrimaryKey(Long accountId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long accountId);

    Account selcetCheck(@Param("loginAccount")String loginAccount,@Param("password")String password);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}