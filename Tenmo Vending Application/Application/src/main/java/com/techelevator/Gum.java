package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Item {

    public Gum(String name, BigDecimal price) {
        super(name, price);
    }


//    @Override
    public String sound() {
        return "Chew, Chew, Yum!";
    }

//    @Override
//    public void setSound(String sound) {
//        super.setSound(sound);
//    }

}
