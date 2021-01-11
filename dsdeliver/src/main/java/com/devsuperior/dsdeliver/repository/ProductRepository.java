package com.devsuperior.dsdeliver.repository;

import com.devsuperior.dsdeliver.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
