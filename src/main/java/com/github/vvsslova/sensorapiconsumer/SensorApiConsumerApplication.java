package com.github.vvsslova.sensorapiconsumer;

import com.github.vvsslova.sensorapiconsumer.exception.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SensorApiConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SensorApiConsumerApplication.class, args);
    }

    @Bean
    ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
