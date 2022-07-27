package com.sistemabancario.product.clients;

import ch.qos.logback.core.net.server.Client;
import reactor.core.publisher.Flux;

public interface IClients {

    public Flux<Client> getClientByTipNum(String tipo, String numDoc);
}
