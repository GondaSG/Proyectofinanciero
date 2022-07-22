package com.sistemabancario.documenttype.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("documenttype")
public class DocumentType{
	@Id
	private String id;
	private String name;
}
