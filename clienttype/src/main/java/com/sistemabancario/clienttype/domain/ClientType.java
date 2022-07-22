package com.sistemabancario.clienttype.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("clienttype")
public class ClientType{
	@Id
	private String id;
	private String name;
	
}
