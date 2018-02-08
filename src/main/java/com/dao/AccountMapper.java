package com.dao;

import com.model.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Long accountId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}