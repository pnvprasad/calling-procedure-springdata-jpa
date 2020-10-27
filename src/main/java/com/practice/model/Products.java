package com.practice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="proc_products")
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	@Id
	private Integer productId;
	private String productName;
	private double productCost;
	private String category;
	
}
