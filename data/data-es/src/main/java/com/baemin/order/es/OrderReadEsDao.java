package com.baemin.order.es;

import com.baemin.order.read.model.OrderReadDao;
import com.baemin.order.read.model.OrderReadDto;

public class OrderReadEsDao implements OrderReadDao {
    @Override
    public OrderReadDto findByOrderNo(String orderNo) {
        return new OrderReadDto(orderNo, "ES");
    }
}
