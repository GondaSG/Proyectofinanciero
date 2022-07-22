package com.sistemabancario.representation.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("representation")
public class Representation {
	@Id
	private String id;
	private String name;
	private String lastName;
	private String documentNumber;
	private String phoneNumber;
}
