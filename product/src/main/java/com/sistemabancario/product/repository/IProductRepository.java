package com.sistemabancario.product.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.product.domain.Product;

public interface IProductRepository extends ReactiveCrudRepository<Product,String> {

}
