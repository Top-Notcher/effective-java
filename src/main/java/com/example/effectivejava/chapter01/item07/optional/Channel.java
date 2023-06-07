package com.example.effectivejava.chapter01.item07.optional;

import java.util.Optional;

public class Channel {
    private int numOfSubscribers;

//    public MemberShip defaultMemberShip() {
//        if(this.numOfSubscribers < 2000) {
////            return null;
//            throw new IllegalStateException();
//        }else {
//            return new MemberShip();
//        }
//    }

    public Optional<MemberShip> defaultMemberShip() {
       if(this.numOfSubscribers < 2000) {
           return Optional.empty();
       }else {
           return Optional.of(new MemberShip());
       }
    }
}
