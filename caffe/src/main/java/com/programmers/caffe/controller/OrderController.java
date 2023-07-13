package com.programmers.caffe.controller;

import com.programmers.caffe.dto.CreateOrderRequestDTO;
import com.programmers.caffe.model.Email;
import com.programmers.caffe.model.Order;
import com.programmers.caffe.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/api/v1/orders")
    public Order createOrder(@RequestBody CreateOrderRequestDTO orderRequest) {
        return orderService.createOrder(
                new Email(orderRequest.getEmail()),
                orderRequest.getAddress(),
                orderRequest.getPostcode(),
                orderRequest.getOrderItems()
        );
    }
}
