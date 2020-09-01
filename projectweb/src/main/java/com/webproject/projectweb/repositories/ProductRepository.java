package com.webproject.projectweb.repositories;


import com.webproject.projectweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
