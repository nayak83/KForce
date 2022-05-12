package com.generali.burritoorderingservice.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Component @Getter @Setter 
public class Order implements Serializable {
	
	/**
	 * TODO: Create enums for all order items allowed values.
	 */
	private static final long serialVersionUID = 8729952928831702721L;
	
	
	public Order() {
		super();
	}

	public Order(String tortilla, String protein, String[] vegetables, String salsa, String extras) {
		super();
		this.tortilla = tortilla;
		this.protein = protein;
		this.vegetables = vegetables;
		this.salsa = salsa;
		this.extras = extras;
	}

	@JsonProperty("tortilla")
	String tortilla;
	
	@JsonProperty("protein")
	String protein;
	
	@JsonProperty("vegetables")
	String[] vegetables;
	
	@JsonProperty("salsa")
	String salsa;
	
	@JsonProperty("extras")
	String extras;
	
}
