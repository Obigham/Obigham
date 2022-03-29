package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;





public class Inventory {
    //INST VARS and CONST
    private static final int DEFAULT_ITEM_COUNT = 5;


    public String InventoryFilePath = "vendingmachine.csv";

    //Open file
    private File srcFile = new File(InventoryFilePath);


    //CtoR
    public Inventory(){}


    //METHODS
    public Map<String, Item> getStock() {

        Map<String, Item> tempStock = new HashMap<>();   //temporary stock to store items read from input file

        //read the input file
        try (Scanner inputFileScan = new Scanner(srcFile)) {

            while (inputFileScan.hasNextLine()) {

                String[] vendComponents = inputFileScan.nextLine().split("\\|");

                String slot = vendComponents[0];
                String name = vendComponents[1];
                String price = vendComponents[2];
                String type = vendComponents[3];
                BigDecimal ItemPrice = new BigDecimal(price);



                if (type.equals("Candy")) {
                    tempStock.put(slot, new Item(name, ItemPrice));
                } else if (type.equals("Drink")) {
                    tempStock.put(slot, new Item(name, ItemPrice));
                } else if (type.equals("Chip")) {
                    tempStock.put(slot, new Item(name, ItemPrice));
                } else if (type.equals("Gum")) {
                    tempStock.put(slot, new Item(name, ItemPrice));
                } else {
                    throw new IOException();

                }
            }
        } catch (FileNotFoundException fnfEx) {
            System.out.println(srcFile.getAbsolutePath() + " is not a valid file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempStock;
    }
}