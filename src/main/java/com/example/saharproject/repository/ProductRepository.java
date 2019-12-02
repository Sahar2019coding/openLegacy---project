package com.example.saharproject.repository;

import com.example.saharproject.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {}

