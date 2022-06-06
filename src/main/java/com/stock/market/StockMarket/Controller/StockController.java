package com.stock.market.StockMarket.Controller;

import com.stock.market.StockMarket.Service.StockService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
@EnableAutoConfiguration
public class StockController {

    @RequestMapping("/")
    BigDecimal home() {
        StockService stockService = new StockService();

        return stockService.findStock("GOOG").getStock().getQuote().getPrice();
    }

    public static void main(String[] args) {
        SpringApplication.run(StockController.class, args);
    }
}