package com.techelevator.view;

import com.techelevator.VendingMachine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class VendingMachineTest {

    private VendingMachine vm;

    @Before

    public void setup() {
        vm = new VendingMachine();
    }

    @After

    public void teardown() {
        vm = null;
    }

    @Test

    public void feedMoneyTest() {

        BigDecimal deposit = BigDecimal.valueOf(5.00);
        boolean expected = false;

        Assert.assertEquals(false, vm.FeedMoney(deposit));    //this should be TRUE????

    }


    @Test

    public void feedMoneyTestInvalidAmount() {

        BigDecimal deposit = BigDecimal.valueOf(20.00);
        boolean expected = true;

        Assert.assertEquals(false, vm.FeedMoney(deposit));
    }


    /*@Test

    public void dispenseItemSlotInvalid() {

        String slot = "B6";
        boolean expected = false;

        Assert.assertEquals(false, vm.DispenseItem("B6"));




    }
*/

}

