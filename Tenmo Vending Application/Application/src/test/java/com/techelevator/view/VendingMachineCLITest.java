package com.techelevator.view;

import com.techelevator.VendingMachineCLI;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class VendingMachineCLITest {

    private final InputStream systemIn = System.in; //storing default sys.in and sys.out
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;    //declaring streams of inputs and outputs
    private ByteArrayOutputStream testOut;


    @Before

    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();  //replacing regular system.out with one the test can read
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes()); //seting up replacement input stream so we can just pass a string in
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();  //reads output and return it as string
    }

    @After

    public void restoreSystemInputOutput() {
        System.setIn(systemIn);     ///reset system in and out to default
        System.setOut(systemOut);
    }


    @Test

    public void test_Exit_Menu() {
        provideInput("3");
        VendingMachineCLI vMenu = new VendingMachineCLI(new Menu(System.in, System.out));
        vMenu.run();
        Assert.assertTrue(getOutput().contains("Thanks for shopping with us today!"));

    }


    @Test

    public void test_Purchase_Menu() {

        provideInput("2\n3\n3"); /// the \n creates a new line between
        VendingMachineCLI vMenu = new VendingMachineCLI(new Menu(System.in, System.out));
        vMenu.run();
        Assert.assertTrue(getOutput().contains("Feed Money"));

    }


    





}
