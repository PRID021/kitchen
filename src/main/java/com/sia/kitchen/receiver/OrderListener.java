package com.sia.kitchen.receiver;

import org.apache.kafka.clients.consumer.ConsumerRecord;
// import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
// import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;




// @Profile("jms-listener")
@Component
public class OrderListener {
    private KitchenUI ui;

    public OrderListener(KitchenUI ui){
        this.ui = ui;
    }

    // @JmsListener(destination =  "tacocloud.order.queue")
    @KafkaListener(topics = "tacocloud.order.queue",groupId = "order-group")
    public void receiveOrder(Object order){
                System.out.println("OrderListener have been created");
        Object objectValue = ((ConsumerRecord) order).value();
        
        ui.displayOrder(objectValue);
    }
}
