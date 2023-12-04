package com.sia.kitchen.receiver;

// import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sia.kitchen.models.TacoOrder;

// import jakarta.jms.JMSException;

@Service
public class KitchenUI {
    public KitchenUI() {
        System.out.println("KitchenUI have been create");
    }

    public void displayOrder(Object order) {
        ObjectMapper mapper =  new ObjectMapper();
     
        try {
            TacoOrder pOrder = mapper.readValue(order.toString(), TacoOrder.class);
             System.out.println(String.valueOf(pOrder));
        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
      
    }

}
