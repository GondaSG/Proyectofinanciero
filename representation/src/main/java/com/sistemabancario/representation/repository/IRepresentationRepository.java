package com.sistemabancario.representation.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.representation.domain.Representation;

public interface IRepresentationRepository extends ReactiveCrudRepository<Representation, String> {

}
