package com.purchase.handler;

import com.purchase.event.ClientEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SendEmailServiceHandler {

    @Async
    @EventListener
    public void notifyUser(ClientEvent event) {
        log.info("Send Email Service: Notifying user via email "
                +event.getClientName() +" : "+Thread.currentThread().getName());
    }
}
