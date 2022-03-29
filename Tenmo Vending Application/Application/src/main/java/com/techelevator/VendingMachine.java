package com.techelevator;

import com.techelevator.view.CoinBox;

import java.math.BigDecimal;
import java.util.Map;



public class VendingMachine {

    private Map<String, Item> stock;
    private Inventory inventory;
    private CoinBox changeMaker;


    public VendingMachine() {
        this.inventory = new Inventory();
        this.changeMaker = new CoinBox();
        this.stock = inventory.getStock();

    }


    public Map<String, Item> getStock() {
        return stock;
    }


    public Map<String, Item> getCurrentStock() {                                //to get current stock
        return inventory.getStock();
    }


    public boolean FeedMoney(BigDecimal amount) {
        double input = amount.doubleValue();
        if((input > 0 && amount.scale() <= 0) && (input == 1.0 || input == 2.0 || input == 5.0 || input == 10.0 )) {

            BigDecimal prevCurrency = changeMaker.getBalance();
            changeMaker.addChange(amount);
                return true;


        } return false;

    }


    public void DispenseItem(String slot) {

        BigDecimal currentBalance = changeMaker.getBalance();
        Item item = stock.get(slot);
        int itemQuantity = item.getQuantity();

        try{
            if(itemQuantity >= 1  && slot != null) {                                         //AND

                if (currentBalance.doubleValue() >= item.getPrice().doubleValue()) {
                    System.out.println("Please enjoy your: " + item.getName() + ", " + item.getPrice());

                    item.setQuantity(itemQuantity - 1);

                    System.out.println(Item.getSound());                                           //this is returning NULL in the CLI

                    System.out.println("There are " + item.getQuantity() + " remaining " + item.getName());
                    changeMaker.subtractBalance(item.getPrice());


                } else if (currentBalance.doubleValue() < item.getPrice().doubleValue()){
                    System.out.println();
                    System.out.println("Insufficient Funds");
            }
                } else if (slot == null) {
                    System.out.println("Please enter a valid number.");
            }
        } catch (Exception e) {
            System.out.println("Your item was not dispensed.");
        }

    }


    public String FinalizeTransaction() {

        BigDecimal finalBalance = changeMaker.getBalance();

        String finalizeMessage = changeMaker.MakeChange();

        return finalizeMessage;
            }


    public BigDecimal getCurrencyHeld() {
        return changeMaker.getBalance();
    }

}


