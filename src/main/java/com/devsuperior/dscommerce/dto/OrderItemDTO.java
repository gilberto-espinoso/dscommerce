package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
    private Long ProductId;
    private String name;
    private Integer quantity;
    private Double price;
    private String imgUrl;

    public OrderItemDTO(Long productId, String name, Integer quantity, Double price, String imgUrl) {
        ProductId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public OrderItemDTO(OrderItem entity) {
        ProductId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        quantity = entity.getQuantity();
        price = entity.getPrice();
        imgUrl = entity.getProduct().getImgUrl();
    }

    public Long getProductId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getSubTotal() {
        return price * quantity;
    }
}
