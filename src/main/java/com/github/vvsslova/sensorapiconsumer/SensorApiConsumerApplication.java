package com.github.vvsslova.sensorapiconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SensorApiConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SensorApiConsumerApplication.class, args);
    }
}
