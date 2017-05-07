package com.jgalds.repository;

import com.jgalds.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 5/7/2017.
 */

@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    Account findByUsername(String username);

}
