package com.purchase.handler;

import com.purchase.event.ClientEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotifyTransportationServiceHandler {

    @Async
    @EventListener
    public void notifyLogisticTransportation(ClientEvent event) {
       log.info("Notify Transportation Service: Notify Transportation to send product to client: "
                +event.getClientId()+" : "+Thread.currentThread().getName());
    }
}
