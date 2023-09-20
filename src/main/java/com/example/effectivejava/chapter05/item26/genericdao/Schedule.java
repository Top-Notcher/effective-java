package com.example.effectivejava.chapter05.item26.genericdao;

import java.time.LocalDateTime;

public class Schedule implements Entity {
    private Long id;
    private LocalDateTime when;

    @Override
    public Long getId() {
        return null;
    }

    public LocalDateTime getWhen() {
        return when;
    }
}
