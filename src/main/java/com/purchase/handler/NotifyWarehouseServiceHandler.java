package com.purchase.handler;

import com.purchase.event.ClientEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotifyWarehouseServiceHandler {

    @Async
    @EventListener
    public void updateWareHouse(ClientEvent event) {
        log.info("Notify Ware House Service: Notifying warehouse to update database "
                +event.getClientName()+" : "+Thread.currentThread().getName());
    }
}
