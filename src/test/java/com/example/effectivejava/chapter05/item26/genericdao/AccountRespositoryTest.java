package com.example.effectivejava.chapter05.item26.genericdao;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AccountRespositoryTest {
    @Test
    void findById() {
        AccountRespository accountRespository = new AccountRespository();
        Account account = new Account(1L, "phm");
        accountRespository.add(account);

        Optional<Account> byId = accountRespository.findById(1L);
        assertTrue(byId.isPresent());
    }
}