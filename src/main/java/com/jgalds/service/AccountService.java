package com.jgalds.service;

import com.jgalds.model.Account;

import java.util.List;

/**
 * Created by Admin on 5/14/2017.
 */
public interface AccountService {
    List<Account> findAll();
    Account findOne(Long id);
    Account findByUsername(String username);
    Account save(Account account);
}
