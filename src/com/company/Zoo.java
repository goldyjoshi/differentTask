package com.company;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private Map<String, Show> shows = new HashMap<>();
    private Map<Integer, IAnimal> animalInformation = new HashMap<>();
//    private Integer bookshow = 0;
    private  Integer currentCapacity = 0;
    private  Integer maxCapacity = 100;
    private IAnimal animalRefId;

    protected Zoo() {
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void addAnimal(Integer animalRefNumber, IAnimal animal) {
        animalInformation.put(animalRefNumber,animal);
    }

    public IAnimal getAnimalById() {
        for (Integer refid : animalInformation.keySet()) {
            System.out.println(animalInformation.get(refid));
        }
        return null;
    }

    public void bookMyShow(String animalName) {
        if (shows.containsKey(animalName)) {
            if (currentCapacity < maxCapacity) {
                System.out.println("Below Show has been booked for you : ");
                System.out.println(shows.get(animalName));
                currentCapacity++;
            } else {
                System.out.println("Shows are fully booked.");
            }
        }else {
            System.out.println("Show of this " + animalName + " animal is not available|:");
        }
    }

    public void removeShow(Animal animalRefId){
        if (animalInformation.keySet().contains(animalRefId)){
            if (animalRefId.age>30){
                animalInformation.remove(animalRefId);
                System.out.println(animalInformation);
            }

            }

        }


    public void addShow(String animalname, Show show) {
        shows.put(animalname,show);
    }

    public Show getShow(String animalname){
        System.out.println("The show of " + animalname + " available");
        return shows.get(animalname);
    }


}
