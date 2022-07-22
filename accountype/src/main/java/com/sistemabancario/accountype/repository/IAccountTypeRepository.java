package com.sistemabancario.accountype.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.accountype.domain.AccountType;

public interface IAccountTypeRepository extends ReactiveCrudRepository<AccountType, String> {

}
