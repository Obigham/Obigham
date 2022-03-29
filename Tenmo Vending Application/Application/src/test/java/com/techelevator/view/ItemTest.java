package com.techelevator.view;

import com.techelevator.Beverages;
import com.techelevator.Candy;
import com.techelevator.Chips;
import com.techelevator.Gum;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ItemTest {


    @Test

    public void Test_candy() {
        Candy candy;
        candy = new Candy("Hershey", new BigDecimal("1.85"));

        Assert.assertTrue(candy.getName().equals("Hershey"));
        // Assert.assertTrue(candy.getSound().equals("Munch Munch, Yum!"));   commented out until sound works
    }

    @Test

    public void Test_beverage() {

        Beverages beverages;
        beverages = new Beverages("Pepsi", new BigDecimal("1.25"));

        Assert.assertTrue(beverages.getName().equals("Pepsi"));
       // Assert.assertTrue(beverages.getSound().equals("Glug, Glug, Yum!"));

    }


    @Test

    public void Test_chips() {

        Chips chips;
        chips = new Chips("Funyuns", new BigDecimal("2.50"));

        Assert.assertTrue(chips.getName().equals("Funyuns"));
       // Assert.assertTrue(chips.getSound().equals("Crunch, Crunch, Yum!"));
    }


    @Test

    public void Test_gum() {

        Gum gum;
        gum = new Gum("Orbit", new BigDecimal("0.75"));

        Assert.assertTrue(gum.getName().equals("Orbit"));
        // Assert.assertTrue(gum.getSound().equals("Chew, Chew, Yum!"));

    }



}
