package com.sia.kitchen.receiver;

// import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.stereotype.Service;

import com.sia.kitchen.models.TacoOrder;

// import jakarta.jms.JMSException;

@Service
public class KitchenUI {
    public KitchenUI() {
        System.out.println("KitchenUI have been create");
        // try {
        //     System.out.println(receiver.receiveOrder());
        // } catch (MessageConversionException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } catch (JMSException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // };

    }

    public void displayOrder(TacoOrder order) {
        System.out.println(order);
    }

}
