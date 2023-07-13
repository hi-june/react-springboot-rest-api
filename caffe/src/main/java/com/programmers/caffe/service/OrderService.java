package com.programmers.caffe.service;

import com.programmers.caffe.model.Email;
import com.programmers.caffe.model.Order;
import com.programmers.caffe.model.OrderItem;

import java.util.List;

public interface OrderService {
    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
