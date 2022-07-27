package com.sistemabancario.product.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("product")
public class Product {
	@Id
	private String id;
	private String name;

	public Object getSubTipo() {
		return null;
	}

	public Object getTipo() {
		return null;
	}
}
