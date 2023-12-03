package com.sia.kitchen.models;

import java.io.Serializable;


public class Ingredient implements Serializable{
    public String id;
    public  String name;
    public  Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
