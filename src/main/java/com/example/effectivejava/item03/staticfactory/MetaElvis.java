package com.example.effectivejava.item03.staticfactory;

// 코드 3-2 제네릭 싱글톤 팩토리 (24쪽)
public class MetaElvis<T> { // 인스턴스 scope

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() {}

    @SuppressWarnings("unckecked")
    public static <E> MetaElvis<E> getInstance() {return (MetaElvis<E>) INSTANCE;}
            // static scope

    public void say(T t){
        System.out.println(t);
    }
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();

    }
}
