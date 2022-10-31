package com.example.effectivejava.item02.javabeans;

// 자바빈즈 패턴 - 일관성이 꺠지고, 불변으로 만들 수 없다.
public class NutritionFacts {
    // 매개변수들을 (기본값이 있다면) 기본값으로 초기화된다.
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();

        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
        // 장점 : 객체생성이 간단해진다.
        // 단점 : 불완전한 상태로 객체가 사용될 수 있다. 불변객체로 만들기 어렵다.
    }
}
