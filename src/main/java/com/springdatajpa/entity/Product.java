package com.springdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodId;
	
	public Product(String prodName, double prodCost, String prodColour) {
		super();
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodColour = prodColour;
	}

	private String prodName;
	
	private double prodCost;
	
	private String prodColour;
	
	
	

}
