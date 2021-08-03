package com.baemin.order.domain;

public class HistoryTransferRepository {
    public HistoryTransfer find() {
        int rand = ((int) (Math.random() * 2)) % 2;
        return new HistoryTransfer(rand == 0);
    }
}
