package com.example.effectivejava.chapter01.item03.field;

// 코드 3-1 public static final 필드 방식의 싱글턴
public class Elvis implements IElvis{

    /**
     * 싱글톤 오브젝트
     */
    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;
    private Elvis() {
        if(created){
            throw new UnsupportedOperationException("can't be created by constructor");
        }
        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성할 것
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
