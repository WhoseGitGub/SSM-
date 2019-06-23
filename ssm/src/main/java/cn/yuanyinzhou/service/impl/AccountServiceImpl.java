package cn.yuanyinzhou.service.impl;

import cn.yuanyinzhou.dao.AccountDao;
import cn.yuanyinzhou.domain.Account;
import cn.yuanyinzhou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账户信息");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account accont) {
        System.out.println("业务层，保存账户");
    }
}
