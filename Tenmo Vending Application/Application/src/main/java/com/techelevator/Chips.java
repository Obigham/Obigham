package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Item {

    public Chips(String name, BigDecimal price) {
        super(name, price);
    }


    //@Override
    public String sound() {
        return "Crunch, Crunch, Yum!";
    }

    //@Override
//    public void setSound(String sound) {
//        super.setSound(sound);
//    }

}
