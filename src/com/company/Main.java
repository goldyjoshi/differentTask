package com.company;

public class Main {

    public static void main(String[] args) {

//        Map<String, Integer> strToInt = new HashMap();
//        strToInt.put("one", 1);
//        strToInt.put("two", 2);
//        strToInt.put("three", 3);
//        Mapping strToIntMapping = new Mapping(strToInt);
//        int intOfStr = strToIntMapping.getMapping("two");
//        System.out.println(intOfStr);
//         MathsFunction calculator = new MathsFunction(23,45);
//        int a1 = calculator.addition();
//        float a2 = calculator.multiplication();
//        System.out.println("value of a1 = " + a1 + "value of a2 = " + a2);
//        System.out.println(a1 +""+"\n"+ a2);
//        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
//        System.out.print("Enter first number- ");
//        int a= sc.nextInt();
//        System.out.print("Enter second number- ");
//        int b= sc.nextInt();
//        Resultant result = new Resultant( a  , b);
//        System.out.println( result.resultant(a, b));

//
        Cat meow = new Cat(1001,4,"black", true,12);
        meow.addNameOfAnimal("Meowses cat");
        meow.addNameOfAnimal("Kushi cat");
        meow.addNameOfAnimal("Pomala cat");
//        Animal c1 = new Cat(1002,4,"black", true,12);
//        c1.addNameOfAnimal("Meowses cat");
//        c1.addNameOfAnimal("Kushi cat");
//        c1.addNameOfAnimal("Pomala cat");
//        c1.eat();
//        c1.speak();

        Lion leo = new Lion(1005,4,25,"golden",true);
        leo.addNameOfAnimal("🐯leo");
        leo.addNameOfAnimal("🦁Lucy");
        leo.getAnimalName();


        Zoo edemZoo = new Zoo();
        edemZoo.addAnimal(1001, meow);
//        edemZoo.addAnimal(1002, c1);
        IAnimal fromzoo = edemZoo.getAnimalById();
//        fromzoo.eat();
//        fromzoo.speak();
        leo.speak();
        leo.eat();
        leo.addPreferredFood("Mouse");
        leo.addPreferredFood("leaf");
        leo.addPreferredFood("rice");
        leo.eat();
//        Show show1 = new Show("meow",30.6,4.50, edemZoo);
//        System.out.println(show1.toString());
//        show1.setAnimalName("meow");
//        show1.getAnimalName();
//        edemZoo.addShow("meow", show1);
//        System.out.println(edemZoo.getShow("meow"));
        Show leoshow2 = new Show("Leo",30.4,2.00,edemZoo);
//        Show lucyshow3 = new Show(" Lucy",30.4,2.30,edemZoo);
        edemZoo.getAnimalById();
        leoshow2.setAnimalName("Leo");
        System.out.println(leoshow2.getAnimalName());
//        lucyshow3.setAnimalName("Lucy");
//        System.out.println(lucyshow3.getAnimalName());
        edemZoo.addShow("Leo", leoshow2);

//        edemZoo.addShow("Lucy" , lucyshow3);
//        System.out.println(edemZoo.getShow("Lucy"));
        System.out.println(edemZoo.getShow("Leo"));
//        leoshow2.bookMyShow("Leo");
//        edemZoo.bookMyShow("Leo");
        edemZoo.bookMyShow("Leoo");
        System.out.println();
        edemZoo.getAnimalById();
//        edemZoo.removeShow(meow);


    }
}
