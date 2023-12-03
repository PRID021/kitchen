package com.sia.kitchen.models;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Taco   implements Serializable{

	private Long id;
	private String name;

	private Date createdAt = new Date();


	private List<Ingredient> ingredients = new ArrayList<>();


	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}

}
