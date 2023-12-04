package com.sia.kitchen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sia.kitchen.receiver.KitchenUI;
import com.sia.kitchen.receiver.OrderListener;

@Configuration
public class Config {
    @Bean
    public OrderListener createOrderListener(KitchenUI ui) {
        System.out.println("OrderListener : line 31");
        return new OrderListener(ui);
    }
}
