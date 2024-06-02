package com.purchase.handler;

import com.purchase.event.ClientEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProcessPaymentServiceHandler {

    @Async
    @EventListener
    public void processBill(ClientEvent event) {
        log.info("Process Payment Service: Process payment to generate bill "
                +event.getClientName()+" : "+Thread.currentThread().getName());
    }
}
