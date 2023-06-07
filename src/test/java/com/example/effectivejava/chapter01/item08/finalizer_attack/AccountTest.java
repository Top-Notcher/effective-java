package com.example.effectivejava.chapter01.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


class AccountTest {

    @Test
    void 일반계정() {
        Account account = new Account("normal");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void 금지_계정() throws InterruptedException {
//        Account account = new Account("test");

        Account account = null;
        try {
            account = new BrokenAccount("test");
        } catch (Exception e) {
            System.out.println("이러면");
        }

        System.gc();
        Thread.sleep(3000L);

//        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }
}