package com.baemin.order.mongo;

import com.baemin.order.read.model.OrderReadDao;
import com.baemin.order.read.model.OrderReadDto;

public class OrderReadMongoDao implements OrderReadDao {
    @Override
    public OrderReadDto findByOrderNo(String orderNo) {
        return new OrderReadDto(orderNo, "MONGO");
    }
}
