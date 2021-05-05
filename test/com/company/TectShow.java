package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TectShow {

    private Show lionShow = new Show("Lion",2.0, 1.0, new Zoo());

    @Before
    public void testSetUp() {
        lionShow.setAnimalName("Tiger");
    }

    @Test
    public void testGetAnimalName() {
        Assert.assertEquals(lionShow.getAnimalName(),"Tiger");
    }
}

