package com.example.effectivejava.chapter02.item14;

import java.util.Comparator;
import java.util.Objects;

// PhoneNumber를 비교할 수 있게 만든다. (91-92쪽)
public class PhoneNumber implements Cloneable, Comparable<PhoneNumber>{
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber pn = (PhoneNumber) o;
        return areaCode == pn.areaCode && prefix == pn.prefix && lineNum == pn.lineNum;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d%04d", areaCode, prefix, lineNum);
    }

    // 코드 14-2 기본 타입 필드가 여럿일 때의 비교자 (91쪽)
    @Override
    public int compareTo(PhoneNumber pn) {
        int result = Short.compare(areaCode, pn.areaCode);
        if(result == 0) {
            result = Short.compare(prefix, pn.prefix);
            if(result == 0) {
                result = Short.compare(lineNum, pn.lineNum);
            }
        }
        return result;
    }

    // 코드 14-3 비교자 생성 메서드를 활용한 비교자(92쪽)
//    private static final Comparator<PhoneNumber> COMPARATOR =
//            Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
//                    .thenComparingInt(pn -> pn.prefix)
//                    .thenComparingInt(pn -> pn.lineNum);
//
//    public int compareTo(PhoneNumber pn) {
//        return COMPARATOR.compare(this, pn);
//    }


}
