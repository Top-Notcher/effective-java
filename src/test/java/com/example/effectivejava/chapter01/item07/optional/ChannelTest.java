package com.example.effectivejava.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();
//        if(memberShip != null) {
//            memberShip.equals(new MemberShip());
//        }
        optional.ifPresent(m -> {
            m.hello();
        });

        MemberShip memberShip = optional.get(); // 값이 없다면 NoSuchElementException
    }
}