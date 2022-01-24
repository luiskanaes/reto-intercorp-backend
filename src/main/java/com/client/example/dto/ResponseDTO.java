package com.client.example.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<E> implements Serializable {
    private E data;
    private String message;
    private HttpStatus status;

    public ResponseDTO(E data, String message) {
        this.data = data;
        this.message = message;
    }
}
