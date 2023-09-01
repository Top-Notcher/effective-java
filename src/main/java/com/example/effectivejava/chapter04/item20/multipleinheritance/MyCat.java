package com.example.effectivejava.chapter04.item20.multipleinheritance;

public class MyCat extends AbstractCat implements Flyable {
    private MyFlayable myFlayable = new MyFlayable();

    @Override
    protected String sound() {
        return "인싸 고양이 두 마리가 나가신다!";
    }

    @Override
    protected String name() {
        return "유미";
    }

    public static void main(String[] args) {
        MyCat myCat = new MyCat();
        System.out.println(myCat.sound());
        System.out.println(myCat.name());
        myCat.fly();
    }

    @Override
    public void fly() {
        this.myFlayable.fly();
    }

    private class MyFlayable extends AbstractFlyable {
        @Override
        public void fly() {
            System.out.println("날아라.");
        }
    }
}
