package com.company;

public class Lion extends Animal{
    private String color;
    private boolean isWild;

    public Lion(Integer refId, int numberOfLeg, Integer age, String color,boolean isWild) {
        super(refId, numberOfLeg, age);
        this.color = color;
        this.isWild = isWild;
    }

    @Override
    public void eat() {
        for(String food: listOfPreferredFood) {
            System.out.println("Lion eat: " + food);
        }

    }




    @Override
    public void speak() {
        System.out.println("Lion 🦁 Roar");

    }

    @Override
    public void addNameOfAnimal(String name) {
        super.addNameOfAnimal(name);
    }


}
