package com.company;

import java.util.Map;

public class Show {
    private String animalName;
    private Double ticketPrice;
    private Double showTiming;
    private Integer numberOfAudience;
    public Integer numberOfshow = 10;
    private  Integer currentCapacity = 0;
    private  Integer maxCapacity = 100;
    private Zoo show;

    public Show(String animalName, Double ticketPrice ,Double showTiming, Zoo show) {
        this.animalName = animalName;
        this.ticketPrice = ticketPrice;
        this.showTiming = showTiming;
        this.numberOfAudience = 100;
        this.show = show;

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

//    public void bookMyShow() {
//        if (currentCapacity < maxCapacity) {
//            System.out.println("Below Show has been booked for you : ");
//            System.out.println(this.toString());
//            currentCapacity++;
//        } else {
//            System.out.println("Shows are fully booked.");
//        }
//    }

    public void bookMyShow(String animalName) {
        if (currentCapacity < maxCapacity) {
            System.out.println("Below Show has been booked for you : ");
            System.out.println(show.getShow(animalName));
            currentCapacity++;
       } else {
            System.out.println("Shows are fully booked.");
        }
    }

    @Override
    public String toString() {
        return "Show ::" +
                "animalName='" + animalName + '\n' +
                 "ticketPrice=" + ticketPrice + "\n" +
                 "showTiming=" + showTiming + "pm" + "\n"+
                 "numberOfAudience=" + numberOfAudience ;

    }
}
