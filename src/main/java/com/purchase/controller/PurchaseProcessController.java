package com.purchase.controller;

import com.purchase.dto.PurchaseRequest;
import com.purchase.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PurchaseProcessController {

    @Autowired
    private EcommerceService ecommerceService;

    @PostMapping("/process")
    public String payment(@RequestBody PurchaseRequest request) {
        return ecommerceService.startPurchaseEvent(request.getClientId(), request.getClientName());
    }
}
