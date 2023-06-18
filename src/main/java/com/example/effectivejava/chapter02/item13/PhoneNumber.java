package com.example.effectivejava.chapter02.item13;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneNumber implements Cloneable{
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeChke(areaCode, 999, "area code");
        this.prefix = rangeChke(prefix, 999, "prefix");
        this.lineNum = rangeChke(lineNum, 9999, "line num");
    }

    private static short rangeChke(int val, int max, String arg) {
        if(val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    // 코드 13-1 가변 상태를 참조하지 않는 클래스용 clone 메서드 (79쪽)
    @Override
    public PhoneNumber clone() {
        try{
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e) {
            throw new AssertionError(); // 일어날 수 없는 일이다.
        }
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber(707, 867, 5309);
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(pn, "제니");
        PhoneNumber clone = pn.clone();
        System.out.println(m.get(clone));

        System.out.println(clone != pn);    // 반드시 true
        System.out.println(clone.getClass() == pn.getClass());  // 반드시 true
        System.out.println(clone.equals(pn));       // true가 아닐 수도 있다.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }
}
