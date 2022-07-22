package com.sistemabancario.accountype.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("accountType")
public class AccountType {
	@Id
	private String id;
	private String name;
	private Double commission;
	private Integer limit;
	private String code;
	private String productId;
}
