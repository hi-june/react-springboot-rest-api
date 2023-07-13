package com.programmers.caffe.service;

import com.programmers.caffe.model.Email;
import com.programmers.caffe.model.Order;
import com.programmers.caffe.model.OrderItem;
import com.programmers.caffe.model.OrderStatus;
import com.programmers.caffe.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DefaultOrderService implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems) {
        Order order = new Order(
                UUID.randomUUID(),
                email,
                address,
                postcode,
                orderItems,
                OrderStatus.ACCEPTED,
                LocalDateTime.now(),
                LocalDateTime.now());
        return orderRepository.insert(order);
    }
}
