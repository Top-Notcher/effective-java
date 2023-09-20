package com.example.effectivejava.chapter05.item26.genericdao;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AccountRespository extends GenericRepository<Account> {

//    private Set<Account> accounts;
//
//    public AccountRespository() {
//        this.accounts = new HashSet<>();
//    }
//
//    public Optional<Account> findById(Long id) {
//        return accounts.stream().filter(a -> a.getId().equals(id)).findAny();
//    }
//
//    public void add(Account account) {
//        this.accounts.add(account);
//    }
}
