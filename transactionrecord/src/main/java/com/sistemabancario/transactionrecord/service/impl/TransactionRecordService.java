package com.sistemabancario.transactionrecord.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.transactionrecord.domain.TransactionRecord;
import com.sistemabancario.transactionrecord.repository.ITransactionRecordRepository;
import com.sistemabancario.transactionrecord.service.ITransactionRecordService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TransactionRecordService implements ITransactionRecordService {

    @Autowired
    private final ITransactionRecordRepository transactionRecordRepository;
    //private final IAccountRepository accountRepository;
    @Override
    public Flux<TransactionRecord> findAll() {return transactionRecordRepository.findAll();}

    @Override
    public Mono<TransactionRecord> findById(String id) {return transactionRecordRepository.findById(id);}

    @Override
    public Mono<TransactionRecord> save(TransactionRecord transactionRecord){
        // Registrar los depositos y retiros de una cuenta bancaria
       //return accountRepository.findById(transactionRecord.getAccount().getId())
       //        .filter(x->x.getAccountType().getCode().equals("1965") ||
       //                x.getAccountType().getProduct().getId().equals(1))
       //        .flatMap(transac -> {
       //            return transactionRecordRepository.save(transactionRecord);
       //        }).switchIfEmpty(Mono.empty());
               //transactionRecordRepository.findById("1")
                 //       .filter(x -> x.getAccount().getAccountType().equals("1976"));
                //.flatMap(transac -> {
                //    return transactionRecordRepository.save(transactionRecord);})
                //.switchIfEmpty(Mono.empty());

        //transactionRecord.getAccount().getAccountType().equals("1965");
        //if(transactionRecord.getAccount().getAccountType().getId() == "1945"){
        //    return transactionRecordRepository.save(transactionRecord);
        //}else{ throw new Exception("Depositos ");}
        return transactionRecordRepository.save(transactionRecord);
    }

    @Override
    public Mono<TransactionRecord> update(TransactionRecord transactionRecord) {return transactionRecordRepository.save(transactionRecord);
    }

    @Override
    public Mono<Void> deleteById(String id) {return transactionRecordRepository.deleteById(id);}

    public void ValidarSaldo(TransactionRecord transactionRecord){
        //Valida que el monto que se registra en la transaccion sea menor al saldo
        //return accountRepository.findById(transactionRecord.getAccount().getId())
          //      .filter(x-> transactionRecord.getAmount()> x.getSaldo());
                //accountRepository.findById(id)
                //.flatMap(x -> {
                //    return x.getSaldo();
                //});

    }
}
