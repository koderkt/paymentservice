package com.koderkt.paymentservice.services;

import com.razorpay.RazorpayException;

public interface PaymentService {
    String createPaymentLink(String orderId) throws RazorpayException;
    String getPaymentStatus(String orderId);
}
