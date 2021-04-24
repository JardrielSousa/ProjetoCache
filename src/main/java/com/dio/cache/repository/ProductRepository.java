package com.dio.cache.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dio.cache.entities.Product;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class ProductRepository {

	public List<Product> listAll(){
		final Product product = Product.builder()
				.sku("prod123")
				.description("produto 1")
				.price(new BigDecimal(10.00))
				.build();
				
		final Product product2 = Product.builder()
				.sku("prod123")
				.description("produto 2")
				.price(new BigDecimal(12.00))
				.build();
		
		log.info("c=ProductResourse,m=listAll");
		List<Product> products = List.of(product,product2);
		return  products ;
	}
}
