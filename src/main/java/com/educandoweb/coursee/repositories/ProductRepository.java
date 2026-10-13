package com.educandoweb.coursee.repositories;

import com.educandoweb.coursee.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
