package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class LionTest {
    private Lion lion = new Lion(1105,4,24, "white" , true);
    private ByteArrayOutputStream outMessages = new ByteArrayOutputStream();

    @Before
    public void testSetUp() {
        System.setOut(new PrintStream(outMessages));
    }

    @After
    public  void restoreSetUp() {
        System.setOut(System.out);
    }

    @Test
    void findIsTrained() {
        assert lion.findIsTrained() == true;
    }

    @Test
    void eat() {
        assert lion.listOfPreferredFood.size() == 0;
        lion.listOfPreferredFood.add("cat");
//        lion.eat();
        assert lion.listOfPreferredFood.size() == 1;

   }

    @Test
    void speak() {
        System.setOut(new PrintStream(outMessages));
        String expectedMessage = "Lion 🦁 Roar";
        lion.speak();
        String actualMessage = outMessages.toString();
        assert actualMessage == expectedMessage;
    }
}