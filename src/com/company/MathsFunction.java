package com.company;

import java.util.Scanner;

public class MathsFunction {
    private int a;
    private int b;


    public MathsFunction(int A, int B) {
        this.a = A;
        this.b = B;
    }

    public int addition() {
        int z = a + b;
        return z;
    }
    public float multiplication(){
        float x = a*b;
        return x;
    }

    public static class Antivirus {
        private Integer guess1;
        private Integer guess2;
        private Integer guess3;

        public Antivirus() {

        }

        public void Guess() {
            Scanner guess = new Scanner(System.in);
            System.out.println("Enter your first guess: " );
            int guess1 = guess.nextInt();
            System.out.println( "Guess of user is " + guess1);


        }

        public static void  main (String[]arg){
            Antivirus virus = new Antivirus();
            virus.Guess();
        }
    }
}