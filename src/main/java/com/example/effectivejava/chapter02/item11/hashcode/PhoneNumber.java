package com.example.effectivejava.chapter02.item11.hashcode;

import com.example.effectivejava.chapter02.item10.Point;

import java.util.*;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

//    private final Point point;

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

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                    && pn.areaCode == areaCode;
    }

    // hashCode 없이는 제대로 동작하지 않는다. 다음 셋 중 하나를 활성화하자.

    // 코드 11-2 전형적인 hashCode 메서드 (70쪽)
//    @Override
//    public int hashCode() {
//        int result = Short.hashCode(areaCode);  //1
////        point.hashCode();
////        Arrays.hashCode();
//        result = 31 * result + Short.hashCode(prefix);  //2
//        result = 31 * result + Short.hashCode(lineNum);  //3
//        return result;
//    }
//
//    // 코드 11-3 한 줄짜리 hashCode 메서드 - 성능이 살짝 아쉽다 (71쪽)
//    @Override
//    public int hashCode() {
//        return Objects.hash(lineNum, prefix, areaCode);
//    }
//
    // 해시코드를 지연 초기화하는 hashCode 메서드 - 스레드 안정성까지 고려해야 한다. (71쪽)
    private volatile int hashCode;   // 자동으로 0으로 초기화된다.

    private Hashtable <PhoneNumber, String> phoneNumberStringHashtable; // synchronized type, thread-safety

    @Override
    public int hashCode() {
        if(this.hashCode != 0) {
            return hashCode;
        }

        synchronized (this) {
            int result = hashCode;
            if(result == 0) {
                result = Short.hashCode(areaCode);
                result = 31 * result + Short.hashCode(prefix);
                result = 31 * result + Short.hashCode(lineNum);
                hashCode = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
//        m.put(new PhoneNumber(707,867,5309));
    }
}
