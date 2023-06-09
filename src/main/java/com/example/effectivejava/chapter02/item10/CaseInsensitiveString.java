package com.example.effectivejava.chapter02.item10;

import java.util.ArrayList;
import java.util.Objects;

// 코드 10-1 잘못된 코드 - 대칭성 위배! (54-55쪽)
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // 대칭성 위배!
//    @Override
//    public boolean equals(Object o) {
//        if(o instanceof CaseInsensitiveString) {
//            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
//        }
//        if(o instanceof String) {   // 한 방향으로만 작동한다.
//            return s.equalsIgnoreCase((String) o);
//        }
//        return false;
//    }

    // 문제 사연(55쪽)
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String polish = "polish";
        System.out.println(cis.equals(polish)); // true
        System.out.println(polish.equals(cis)); // false

        ArrayList<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(polish));  // false
    }

    // 수정한 equals 메서드 (56쪽)
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}
