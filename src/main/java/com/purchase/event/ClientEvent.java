package com.purchase.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class ClientEvent extends ApplicationEvent {

    private String clientId;
    private String clientName;

    public ClientEvent(Object source, String clientId, String clientName) {
        super(source);
        this.clientId = clientId;
        this.clientName = clientName;
    }
}
