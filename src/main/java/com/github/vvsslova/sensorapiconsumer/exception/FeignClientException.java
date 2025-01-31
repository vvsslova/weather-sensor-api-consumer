package com.github.vvsslova.sensorapiconsumer.exception;

import lombok.Getter;

@Getter
public class FeignClientException extends RuntimeException {
    private final int statusCode;

    public FeignClientException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
}
