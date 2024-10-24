package com.koderkt.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePaymentRequestLinkDto {
    private String orderId;
}
