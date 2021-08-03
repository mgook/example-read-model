package com.baemin.order.read.model;

public class OrderReadDto {
    public String orderNo;
    public String datasource;

    @Override
    public String toString() {
        return "OrderReadDto{" +
                "orderNo='" + orderNo + '\'' +
                ", datasource='" + datasource + '\'' +
                '}';
    }

    public OrderReadDto(String orderNo, String datasource) {
        this.orderNo = orderNo;
        this.datasource = datasource;
    }
}
