package com.programmers.caffe.dto;

import com.programmers.caffe.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateProductRequestDTO {
    private String productName;
    private Category category;
    private long price;
    private String description;
}
