package com.sia.kitchen.receiver;

// import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
// import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.sia.kitchen.models.TacoOrder;


// @Profile("jms-listener")
@Component
public class OrderListener {
    private KitchenUI ui;

    public OrderListener(KitchenUI ui){
        this.ui = ui;
    }

    // @JmsListener(destination =  "tacocloud.order.queue")
    @KafkaListener(topics = "tacocloud.orders.topic",groupId = "order-group")
    public void receiveOrder(TacoOrder order){
                System.out.println("OrderListener have been created");
        ui.displayOrder(order);
    }
}
