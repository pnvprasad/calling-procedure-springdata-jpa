package com.practice.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.model.Products;
import com.practice.repo.ProductsRepository;
@Component
public class CallingProcedureRunner implements CommandLineRunner {
	@Autowired
	ProductsRepository productsRepository; 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("############Calling Procedure ################");
		List<Products> produtList=productsRepository.getAllProuctsByType_ProcedureCall("TV");
		System.out.println("Size:"+produtList.size());
		produtList.forEach(System.out::println);
		System.out.println("############ Endo of Calling Procedure ################");
	}

}
