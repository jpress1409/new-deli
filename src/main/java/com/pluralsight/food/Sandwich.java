package com.pluralsight.food;

import java.util.Arrays;
import java.util.List;

public class Sandwich {
    private String bread;
    private static String size;
    private boolean toasted;
    private double price;
    private Meat meat;
    private Cheese cheese;
    private List<Sauce> sauces;
    private List<StandardTopping> toppings;

    public Sandwich(String size, String bread, Meat meat, Cheese cheese, List<StandardTopping> toppings, List<Sauce> sauces, boolean toasted) {
        this.toasted = toasted;
        Sandwich.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauces = sauces;
        this.price = price;
    }

    public double calcPrice(){
        return getPrice() + Meat.getPrice() + Cheese.getPrice();
    }
    public double getPrice(){
        switch(getSize()){
            case "Small" -> price = 5.5;
            case "Medium" -> price = 7;
            case "Large" -> price = 8.5;
        }

        return price;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public static String getSize() {
        return size;
    }

    public static void setSize(String size) {
        Sandwich.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    public static String[] listBread(){
        String[] breads = new String[4];
        breads[0] = "White";
        breads[1] = "Wheat";
        breads[2] = "Rye";
        breads[3] = "Wrap";

        return breads;
    }
    public static void displayBread(String [] breads){
        for(String bread : breads){
            System.out.println(bread);
        }
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size + '\'' +
                ", bread='" + bread + '\'' +
                ", price=" + price + '\'' +
                ", meat=" + meat + '\'' +
                ", cheese=" + cheese + '\'' +
                ", toppings=" + toppings + '\'' +
                ", sauces=" + sauces + '\'' +
                ", toasted=" + toasted + '\'' +
                '}';
    }
}
