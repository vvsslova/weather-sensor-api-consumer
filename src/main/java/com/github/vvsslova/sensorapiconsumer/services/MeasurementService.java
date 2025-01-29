package com.github.vvsslova.sensorapiconsumer.services;

import com.github.vvsslova.sensorapiconsumer.dto.MeasurementDTO;
import com.github.vvsslova.sensorapiconsumer.clients.MeasurementClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MeasurementService {
    private final MeasurementClient measurementClient;

    public List<MeasurementDTO> getAllMeasurements(int page, int size) {
        return measurementClient.findAll(page, size);
    }

    public Integer getRainyDaysCount() {
        return measurementClient.getRainyDaysCount();
    }

    public MeasurementDTO saveMeasurement(MeasurementDTO measurementDTO) {
        return measurementClient.save(measurementDTO);
    }
}
