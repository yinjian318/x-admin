package com.service;

import com.model.Account;

import java.util.Map;

/**
 * Created by YINJIAN on 2018/2/9.
 */
public interface AccountService {

    Account selectByPrimaryKey(Long accountId);

    Map<String,Object> selcetCheck(String loginAccount, String password);
}
