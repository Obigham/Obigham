package com.techelevator;

import java.math.BigDecimal;

public class Beverages extends Item {

    public Beverages(String name, BigDecimal price) {
        super(name, price);
    }


//    @Override
    public String sound() {
        return "Glug, Glug, Yum!";
    }

//    @Override
//    public void setSound(String sound) {
//        super.setSound(sound);
//    }



}
