package com.techelevator;


import java.math.BigDecimal;

public class Item {

    //instance variables
    private String name = "";
    private BigDecimal price;
    private int quantity = 5;
    private static String sound = "";

    public static String getSound(Item item) {
        return sound;
    }


    //getters
    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //CTOR
    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, int quantity, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(String sound){
        this.sound = sound;
    }


    //GETTER for Sound method
    public static String getSound() {
        return sound;
    }
//
//    public void setSound(String sound) {
//        this.sound = sound;
//    }
}

