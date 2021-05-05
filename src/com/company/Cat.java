package com.company;

public class Cat extends Animal {


    private String color;
    private boolean isPet;

    public Cat(Integer refId, int numberOfLeg, String color, boolean isPet, Integer age) {
        super(refId, numberOfLeg, age);
        this.color = color;
        this.isPet = true;
    }

    @Override
    public void eat() {
        System.out.println("Eating mouse mostly");
    }

    @Override
    public void speak() {
        System.out.println("Miowe - Miowe");
    }

    @Override
    public void addNameOfAnimal(String name) {
        super.addNameOfAnimal(name);
    }

    @Override
    public void addPreferredFood(String foodName) {
        super.addPreferredFood(foodName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

    public String speciality() {
        return "I like to eat Mouse";
    }
}
