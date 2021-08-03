package com.baemin.order.rds;

import com.baemin.order.read.model.OrderReadDao;
import com.baemin.order.read.model.OrderReadDto;

public class OrderReadRdsDao implements OrderReadDao {
    @Override
    public OrderReadDto findByOrderNo(String orderNo) {
        return new OrderReadDto(orderNo, "RDS");
    }
}
