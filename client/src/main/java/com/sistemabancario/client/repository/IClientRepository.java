package com.sistemabancario.client.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.client.domain.Client;

public interface IClientRepository extends ReactiveCrudRepository<Client, String> {

}
