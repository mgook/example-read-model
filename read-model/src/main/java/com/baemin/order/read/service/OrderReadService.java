package com.baemin.order.read.service;

import com.baemin.order.domain.HistoryTransferRepository;
import com.baemin.order.read.model.OrderReadDao;
import com.baemin.order.read.model.OrderReadDto;

// ???: Service? Finder?
public class OrderReadService {

    private final OrderReadDao mongo;
    private final OrderReadDao rds;
    private final HistoryTransferRepository historyTransferRepository;


    public OrderReadService(OrderReadDao mongo, OrderReadDao rds, HistoryTransferRepository historyTransferRepository) {
        this.mongo = mongo;
        this.rds = rds;
        this.historyTransferRepository = historyTransferRepository;
    }

    public OrderReadDto findByOrderNo(String orderNo) {
        if (historyTransferRepository.find().isUseRds()) {
            return rds.findByOrderNo(orderNo);
        } else {
            return mongo.findByOrderNo(orderNo);
        }
    }
}
