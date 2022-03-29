package com.techelevator.view;

import java.math.BigDecimal;

public class CoinBox {

    private BigDecimal balance;

    public CoinBox() {

        balance = new BigDecimal(0);                                                                         //set balance to 0
    }

                                                                                                                 //method

    public String MakeChange() {

        int change = (int) (balance.doubleValue() * 100); // convert change to int to do penny math

        //to get quarters, divide change by 25.
        int quarters = change / 25;
        change = change % 25;   //the remainder gets stored in change (so weve taken care of quarters)

        //to get dimes, divide change by 10.
        int dimes = change / 10;
        change = change % 10;  //the remainder gets stored in change (now we've taken care of quarters and dimes)

        //nickels - divide by 5

        int nickels = change / 5;
        change = change % 5;

        balance = new BigDecimal(0);

        return ("Your change today is " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + change + " pennies");

    }

 public void addChange(BigDecimal addCurrency) {   //adding change to current balance -- DONT THINK WE NEED
     balance = balance.add(addCurrency);
    }


    public BigDecimal getBalance() {
        return balance;
    }


    public void subtractBalance(BigDecimal subBalance) {
        balance = balance.subtract(subBalance);
    }
   }




//method for insufficient funds

    /*public boolean spendChange(BigDecimal price) {
        if(balance.compareTo(price) >= 0) {    //if we have enough to cover the cost, subtract it and return true
            balance = balance.subtract(price); //BigDecimal ... have to use subtract.
            return true;
        }
        else {
            return false;
        }
    }*/

