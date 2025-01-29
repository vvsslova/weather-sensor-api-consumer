package com.github.vvsslova.sensorapiconsumer.clients;

import com.github.vvsslova.sensorapiconsumer.dto.SensorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "sensor-client", url = "http://localhost:8080/api/sensors")
public interface SensorClient {

    @PostMapping("/registry")
    SensorDTO save(@RequestBody SensorDTO sensorDTO);
}
