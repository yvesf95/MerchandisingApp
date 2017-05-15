package com.jgalds.config;

import com.jgalds.model.Account;
import com.jgalds.repository.AccountRepository;
import com.jgalds.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 5/7/2017.
 */

@Service
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    @Autowired
    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountService.findByUsername(username);
        return new User(account.getUsername(), account.getPassword(),
                account.isActive(), account.isActive(), account.isActive(), account.isActive(),
                AuthorityUtils.createAuthorityList(account.getRole()));
    }
}
