package com.service.imp;

import com.dao.AccountMapper;
import com.model.Account;
import com.service.AccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YINJIAN on 2018/2/9.
 */
@Service("/AccountService")
public class AccountServiceImp implements AccountService {
    private static final Logger log = Logger.getLogger(MemberServiceImp.class);
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account selectByPrimaryKey(Long accountId) {
        return null;
    }

    @Override
    public Map<String,Object> selcetCheck(String loginAccount, String password) {
        Map<String,Object> map = new HashMap<>();
        try{
            log.info("##############开始调用接口memberMapper.selectAll#################");
            Account account = accountMapper.selcetCheck(loginAccount,password);
            if(null !=account && !"".equals(account)){
                if(account.getLoginAccount().equals(loginAccount) && account.getPassword().equals(password)){
                    map.put("state",true);
                    map.put("msg","登录成功");
                }else {
                    map.put("state",false);
                    map.put("msg","用户名或密码忘记!");
                }
            }else{
                map.put("state",false);
                map.put("msg","系统异常，请重新登录!");
            }
            log.info("##############成功,调用接口memberMapper.selectAll#################");
            return map;
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            return null;
        }
    }
}
