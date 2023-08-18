package com.example.effectivejava.chapter04.item17.part3;

import java.math.BigInteger;

public class BigIntegerUtils {

    // BigInteger은 상속을 막아두지 않았기에 방어적인 복사를 사용
    public static BigInteger safeInstance(BigInteger val) {
        return val.getClass() == BigInteger.class ? val : new BigInteger(val.toByteArray());
    }
}
