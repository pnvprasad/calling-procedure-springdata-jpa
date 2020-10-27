package com.practice.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.model.Products;
import com.practice.repo.ProductsRepository;
//@Component
public class ProudctsRunner implements CommandLineRunner {
	@Autowired
	ProductsRepository productsRepository; 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("############ for procedure purpose data sotored #########");
		Products products1=new Products(1,"Iphone",25000.0,"mobiles");
		Products products2=new Products(2,"Samusung",2000.0,"mobiles");
		Products products3=new Products(3,"Mi",10000.0,"TV");
		Products products4=new Products(4,"Nokia",15000.0,"TV");
		Products products5=new Products(5,"Lg",25000.0,"TV");
		productsRepository.saveAll(Arrays.asList(new Products[] {products1,products2,products3,products4,products5}));
	
		System.out.println("############ End for procedure purpose data sotored #########");
	}

}
