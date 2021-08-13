package com.dio.cache.resource;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.cache.entities.Product;
import com.dio.cache.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductResourse {
	
	private final ProductService productService;

	@GetMapping("/")
	@Cacheable("product")
	public String listAll() {
		log.info("c=ProductResourse,m=listAll");
		return "usando cache";
	}
	
	@GetMapping("/cancel")
	@CacheEvict("product")
	public String cancel() {
		log.info("Limpando cache");
		return "Cache cancelado";
	}

}
