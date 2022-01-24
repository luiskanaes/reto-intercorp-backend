package com.client.example.dto;

import com.client.example.entity.Cliente;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListClientesDTO {
    private Cliente cliente;
    private LocalDate fechaProbableMuerte;
}
