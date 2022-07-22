package com.sistemabancario.documenttype.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.documenttype.domain.DocumentType;

public interface IDocumentTypeRepository extends ReactiveCrudRepository<DocumentType,String> {

}
