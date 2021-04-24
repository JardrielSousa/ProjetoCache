package com.dio.cache.entities;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
	private String sku;
	private BigDecimal price;
	private String description;
	
}
