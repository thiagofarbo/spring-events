package com.purchase.service;

import com.purchase.event.ClientEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EcommerceService {

    private final ApplicationEventPublisher eventPublisher;

    public String startPurchaseEvent(final String clientId, final String clientName) {

        log.info("Purchase event initiated {} ", clientName);

        //publish an event
        eventPublisher.publishEvent(new ClientEvent(this, clientId, clientName));

        log.info("Purchase event completed {} ", clientName);
        return "Purchase completed for client " + clientName + " with ID " + clientId + " has been successfully!";
    }
}
