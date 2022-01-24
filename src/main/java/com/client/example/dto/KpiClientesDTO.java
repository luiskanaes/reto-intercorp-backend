package com.client.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KpiClientesDTO {
    private Double promedio;
    private Double desviacionEstandar;
}
