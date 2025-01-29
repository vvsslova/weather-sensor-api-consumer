package com.github.vvsslova.sensorapiconsumer.services;

import com.github.vvsslova.sensorapiconsumer.dto.SensorDTO;
import com.github.vvsslova.sensorapiconsumer.clients.SensorClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SensorService {
    private final SensorClient sensorClient;

    public SensorDTO save(SensorDTO sensor) {
        return sensorClient.save(sensor);
    }
}
