package com.example.effectivejava.item08.finalizer_attack;

import java.math.BigDecimal;

public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if(accountId.equals("test")) {
            throw new IllegalArgumentException("test은 계정을 막습니다.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

    @Override
    protected final void finalize() throws Throwable {
    }
}
