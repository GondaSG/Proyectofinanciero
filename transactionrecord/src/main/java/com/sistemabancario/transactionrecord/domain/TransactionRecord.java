package com.sistemabancario.transactionrecord.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("transactionrecord")
public class TransactionRecord{
	@Id
	private String id;
	private String accountId;
	private String operationTypeId;
	private Double amount;
	private Integer share;
	private Date payDate;
}
