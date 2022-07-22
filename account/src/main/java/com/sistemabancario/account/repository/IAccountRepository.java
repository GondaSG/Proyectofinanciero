package com.sistemabancario.account.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.account.domain.Account;

public interface IAccountRepository extends ReactiveCrudRepository<Account, String>{

}
