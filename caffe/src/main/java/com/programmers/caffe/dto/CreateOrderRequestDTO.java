package com.programmers.caffe.dto;

import com.programmers.caffe.model.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CreateOrderRequestDTO {
    private String email;
    private String address;
    private String postcode;
    List<OrderItem> orderItems;
}
