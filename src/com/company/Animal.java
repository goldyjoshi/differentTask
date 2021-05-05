package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal  implements IAnimal {
    protected  List<String> nameOfAnimal = new ArrayList<>();
    public Integer animalReferenceId;
    public Integer age;
    protected int numberOfLeg;
    public List<String> listOfPreferredFood = new ArrayList<>();
    protected boolean isTrained;

    public Animal(Integer animalReferenceId, int numberOfLeg, Integer age) {
        this.animalReferenceId = animalReferenceId;
        this.age = age;
        this.numberOfLeg = numberOfLeg;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameOfAnimal=" + nameOfAnimal +
                ", animalReferenceId=" + animalReferenceId +
                ", age=" + age +
                ", numberOfLeg=" + numberOfLeg +
                ", food=" + listOfPreferredFood +
                ", istrained=" + isTrained +
                '}';
    }

    public boolean findIsTrained() {
        isTrained = false;
        if (age > 10) {
            System.out.println("This animal is trained");
            return true;
        }
        return false;
    }
    @Override
    public void addNameOfAnimal(String name) {
        nameOfAnimal.add(name);
    }

    public void getAnimalName(){
        for (String name : nameOfAnimal) {
            System.out.println("Name of animal:" + name);
        }
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public void addPreferredFood(String foodName) {
        listOfPreferredFood.add(foodName);
    }

    public List<String> getListOfPreferredFood() {
        return listOfPreferredFood;
    }

//    public void setNameOfAnimal(List<String> nameList) {
//        nameOfAnimal = nameList;
//    }
/**/
    public void listOfAnimalName() {
        for (String names : nameOfAnimal) {
            System.out.println("Name :" + names + "\n");
        }
    }
}
