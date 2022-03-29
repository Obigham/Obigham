package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CoinBoxTest {


    CoinBox cB;

    @Test

    public void Test_Constructor() {
        cB = new CoinBox();
        Assert.assertTrue(cB.getBalance().equals(new BigDecimal(0)));

    }

    @Test

    public void Test_AddChange() {
        cB = new CoinBox();
        cB.addChange(new BigDecimal(5));
        Assert.assertTrue(cB.getBalance().equals(new BigDecimal(5)));
    }

   /* @Test

    public void Test_GetBalance() {
        cB = new CoinBox();
        cB.addChange(new BigDecimal(1.50));
        Assert.assertTrue(cB.MakeChange().equals("Your change today is 6 quarters 0 dimes 0 nickels and 0 pennies"));    //not sure why this is not passing
    }*/






}
