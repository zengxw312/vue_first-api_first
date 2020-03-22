package com.vuefirst.api.entity;

import lombok.Data;

@Data
public class IndexRo {
    private String  productId;
    private String  proUrl;
    private String proName;
    private String proPrice;
    private String oldPrice;
}
