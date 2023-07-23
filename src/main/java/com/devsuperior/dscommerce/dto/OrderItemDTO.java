package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
    private Long ProductId;
    private String name;
    private Integer quantity;
    private Double price;

    public OrderItemDTO(Long productId, String name, Integer quantity, Double price) {
        ProductId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemDTO(OrderItem entity) {
        ProductId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        quantity = entity.getQuantity();
        price = entity.getPrice();
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
    public Double getSubTotal(){
        return price * quantity;
    }
}
