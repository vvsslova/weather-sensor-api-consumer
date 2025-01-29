package com.github.vvsslova.sensorapiconsumer.clients;

import com.github.vvsslova.sensorapiconsumer.dto.MeasurementDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "measurement-client", url = "http://localhost:8080/api/measurements")
public interface MeasurementClient {

    @GetMapping()
    List<MeasurementDTO> findAll(@RequestParam(required = false) int page,
                                 @RequestParam(required = false) int size);

    @GetMapping("/rainy-days/count")
    Integer getRainyDaysCount();

    @PostMapping("/add")
    MeasurementDTO save(@RequestBody MeasurementDTO measurementDTO);
}
