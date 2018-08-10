package com.spiderman.skiRental.RentalCase.Entities;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public abstract class Shoes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String discipline;
	
	@Column(nullable = false)
	private String productName;
	
	@Column(nullable = false)
	private String brand;
	
}
