package com.baemin.order.read.model;

public interface OrderReadDao {
    OrderReadDto findByOrderNo(String orderNo);
}
