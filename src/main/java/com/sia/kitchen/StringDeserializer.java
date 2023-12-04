package com.sia.kitchen;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StringDeserializer implements Deserializer<Object> {
     private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public Object deserialize(String topic, byte[] data) {
        try {
            if (data == null){
                System.out.println("Null received at deserializing");
                return null;
            }
            final Object object =  objectMapper.readValue(new String(data, "UTF-8"), Object.class);
            return object;
        } catch (Exception e) {
            throw new SerializationException("Error when deserializing byte[] to MessageDto");
        }
    }




}