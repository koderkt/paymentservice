package com.koderkt.paymentservice.controllers;


import com.koderkt.paymentservice.dtos.CreatePaymentRequestLinkDto;
import com.koderkt.paymentservice.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/webhook")
    public void addWebHookEvent() {

    }

    @PostMapping("/")
    public String paymentLink(@RequestBody CreatePaymentRequestLinkDto createPaymentRequestLinkDto) throws RazorpayException {
        return paymentService.createPaymentLink(createPaymentRequestLinkDto.getOrderId());
    }
}
