package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDto {

    //ATRIBUTOS
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    //CONSTRUTORES
    public OrderItemDto() {
    }

    public OrderItemDto(Long productId, String name, Double price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDto(OrderItem entity) {
        this.productId = entity.getProduct().getId();
        this.name = entity.getProduct().getName();
        this.price = entity.getPrice();
        this.quantity = entity.getQuantity();

    }

    //GETTER
    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    //MÉTODOS
    //Calculo subtotal
    public Double getSubTotal() {
        return price * quantity;
    }
}
