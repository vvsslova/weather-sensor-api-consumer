package com.github.vvsslova.sensorapiconsumer.controller;

import com.github.vvsslova.sensorapiconsumer.dto.MeasurementDTO;
import com.github.vvsslova.sensorapiconsumer.dto.SensorDTO;
import com.github.vvsslova.sensorapiconsumer.services.MeasurementService;
import com.github.vvsslova.sensorapiconsumer.services.SensorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@AllArgsConstructor
public class ApiController {
    private final MeasurementService measurementService;
    private final SensorService sensorService;

    @GetMapping("/measurements")
    public ResponseEntity<List<MeasurementDTO>> getMeasurements(@RequestParam int page,
                                                                @RequestParam int size) {
        return ResponseEntity.ok(measurementService.getAllMeasurements(page, size));
    }

    @PostMapping("/add/sensor")
    public ResponseEntity<SensorDTO> addSensor(@RequestBody SensorDTO sensor) {
        return ResponseEntity.ok(sensorService.save(sensor));
    }

    @PostMapping("/add/measurement")
    public ResponseEntity<MeasurementDTO> addMeasurement(@RequestBody MeasurementDTO measurement) {
        return ResponseEntity.ok(measurementService.saveMeasurement(measurement));
    }

    @GetMapping("/rainy-days/сount")
    public ResponseEntity<Integer> getRainyDaysCount() {
        return ResponseEntity.ok(measurementService.getRainyDaysCount());
    }
}
