// package com.sia.kitchen.receiver;

// import org.springframework.jms.core.JmsTemplate;
// import org.springframework.jms.support.converter.MessageConversionException;
// import org.springframework.stereotype.Component;

// import com.sia.kitchen.models.TacoOrder;

// import jakarta.jms.JMSException;

// @Component
// public class JsmOrderReceiver implements OrderReceiver {
//     private JmsTemplate jms;

//     public JsmOrderReceiver(JmsTemplate template){
//         System.out.println("JsmOrderReceiver have been created");
//         this.jms = template;
//     }

//     public TacoOrder receiveOrder() throws MessageConversionException, JMSException{
//         return (TacoOrder) jms.receiveAndConvert("tacocloud.order.queue");
//     }
// }
