package com.sistemabancario.account.service;

import com.sistemabancario.account.domain.Account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountService {
    Flux<Account> findAll();

    Mono<Account> findById(String id);

    Mono<Account> save(Account account);

    Mono<Account> update(Account account);

    public Mono<Void> deleteById(String id);
}
