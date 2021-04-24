package com.dio.cache.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dio.cache.entities.Product;
import com.dio.cache.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository  productRepository; 
	
	@Cacheable("product-cache")
	public  List<Product> listAll() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("c=ProductService,s=listAll");
		return productRepository.listAll();
	}
}
