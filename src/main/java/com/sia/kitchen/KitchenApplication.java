package com.sia.kitchen;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
// import org.springframework.jms.support.converter.MappingJackson2MessageConverter;

import com.sia.kitchen.models.TacoOrder;
import com.sia.kitchen.receiver.KitchenUI;
import com.sia.kitchen.receiver.OrderListener;

@SpringBootApplication
public class KitchenApplication {

	// @Bean
	// public MappingJackson2MessageConverter messageConverter() {

	// 	MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
	// 	messageConverter.setTypeIdPropertyName("_typeId");
	// 	Map<String, Class<?>> typeIdMappings = new HashMap<String, Class<?>>();
	// 	typeIdMappings.put("order", TacoOrder.class);
	// 	messageConverter.setTypeIdMappings(typeIdMappings);
	// 	return messageConverter;
	// }

	@Bean
	public OrderListener createOrderListener(KitchenUI ui){
		System.out.println("OrderListener : line 31");
		return new OrderListener(ui);
	}

	public static void main(String[] args) {
		SpringApplication.run(KitchenApplication.class, args);
	}

}
