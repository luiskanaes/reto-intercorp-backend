package com.client.example.controller;

import com.client.example.dto.ResponseDTO;
import com.client.example.entity.Cliente;
import com.client.example.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    private final ClienteService service;

    @PostMapping(path = "/crea")
    public ResponseEntity<ResponseDTO> creaCliente(@RequestBody Cliente cliente) {
        ResponseDTO response = service.create(cliente);
        return ResponseEntity.status(response.getStatus()).body(new ResponseDTO<>(response.getData(), response.getMessage(), response.getStatus()));
    }

    @GetMapping(path = "/kpi")
    public ResponseEntity<ResponseDTO> kpiClientes() {
        ResponseDTO response = service.kpi();
        return ResponseEntity.status(response.getStatus()).body(new ResponseDTO<>(response.getData(), response.getMessage(), response.getStatus()));
    }

    @GetMapping(path = "/list")
    public ResponseEntity<ResponseDTO> list() {
        ResponseDTO response = service.list();
        return ResponseEntity.status(response.getStatus()).body(new ResponseDTO<>(response.getData(), response.getMessage(), response.getStatus()));
    }
}
