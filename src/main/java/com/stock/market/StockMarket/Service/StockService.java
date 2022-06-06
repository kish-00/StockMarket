package com.stock.market.StockMarket.Service;

import com.stock.market.StockMarket.Wrapper.StockWrapper;

import org.springframework.stereotype.Service;
import yahoofinance.YahooFinance;

//biz logic
@Service
public class StockService {
    public StockWrapper findStock(String symbol) {
        try {
            return new StockWrapper(YahooFinance.get(symbol));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}