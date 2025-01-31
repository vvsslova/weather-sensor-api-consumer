package com.github.vvsslova.sensorapiconsumer.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.vvsslova.sensorapiconsumer.dto.ErrorResponseDTO;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Exception decode(String methodKey, Response response) {

        try {
            ErrorResponseDTO errorResponseDTO = objectMapper.readValue(response.body().asInputStream(), ErrorResponseDTO.class);
            return new FeignClientException(errorResponseDTO.getMessage(), response.status());
        } catch (Exception e) {
            return new RuntimeException("Ошибка при обработке ответа от сервера", e);
        }
    }
}

