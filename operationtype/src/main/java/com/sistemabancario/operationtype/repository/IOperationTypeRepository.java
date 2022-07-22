package com.sistemabancario.operationtype.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.operationtype.domain.OperationType;

public interface IOperationTypeRepository extends ReactiveCrudRepository<OperationType,String> {

}
