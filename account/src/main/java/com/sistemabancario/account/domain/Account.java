package com.sistemabancario.account.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document("account")
public class Account {
    @Id
    private String id;
    private Long clientId;
    private Long accountTypeId;
    private String nroCuenta;
    private Double saldo;
    private Long representationId;
}
