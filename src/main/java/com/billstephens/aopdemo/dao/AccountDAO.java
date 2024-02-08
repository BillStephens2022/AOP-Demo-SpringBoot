package com.billstephens.aopdemo.dao;

import com.billstephens.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();


}
