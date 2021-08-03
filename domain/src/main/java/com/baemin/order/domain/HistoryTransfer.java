package com.baemin.order.domain;

public class HistoryTransfer {
    public boolean useRds;

    public HistoryTransfer(boolean useRds) {
        this.useRds = useRds;
    }

    public boolean isUseRds() {
        return useRds;
    }
}
