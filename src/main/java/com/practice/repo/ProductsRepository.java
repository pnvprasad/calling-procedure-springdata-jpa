package com.practice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practice.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

	@Query(value="CALL GETALLPRODUCTS(:category)" ,nativeQuery=true)
	List<Products> getAllProuctsByType_ProcedureCall(@Param("category") String category);

}
