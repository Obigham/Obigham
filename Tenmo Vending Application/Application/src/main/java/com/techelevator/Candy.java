package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Item {

    public Candy(String name, BigDecimal price) {
        super(name, price);
    }

//    @Override
    public String sound() {
        return "Munch, Munch, Yum!";
    }

//    @Override
//    public void setSound(String sound) {
//        super.setSound(sound);
//    }
}
