package com.stock.market.StockMarket.Wrapper;

import yahoofinance.Stock;
import java.time.LocalDateTime;

//stores stock data
public class StockWrapper {
    private final Stock stock;
    private final LocalDateTime lastAccess;

    public StockWrapper(Stock stock) {
        this.stock = stock;
        this.lastAccess = LocalDateTime.now();
    }

    public LocalDateTime getLastAccess() {
        return lastAccess;
    }

    public Stock getStock() {
        return stock;
    }
}