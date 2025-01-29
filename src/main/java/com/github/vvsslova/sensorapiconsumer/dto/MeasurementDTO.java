package com.github.vvsslova.sensorapiconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MeasurementDTO {

    private float value;
    private boolean raining;
    private SensorDTO sensor;
}
