package com.programmers.caffe.repository;

import com.programmers.caffe.model.Order;

public interface OrderRepository {
    Order insert(Order order);
}
