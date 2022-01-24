package com.client.example.controller;

import com.client.example.dto.ResponseDTO;
import com.client.example.entity.Cliente;
import com.client.example.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/clientes")
public class ClienteController {

    @Autowired
    ClienteService service;


    @PostMapping(path = "/crea", produces = "application/json", consumes = "application/json")
    public ResponseEntity<ResponseDTO> creaCliente(@RequestBody Cliente cliente) {
        ResponseDTO response = service.create(cliente);
        return ResponseEntity.status(response.getStatus()).body(new ResponseDTO<>(response.getData(), response.getMessage(), response.getStatus()));
    }

    @GetMapping(path = "/kpi", produces = "application/json")
    public ResponseEntity<ResponseDTO> kpiClientes() {
        ResponseDTO response = service.kpi();
        return ResponseEntity.status(response.getStatus()).body(new ResponseDTO<>(response.getData(), response.getMessage(), response.getStatus()));
    }

    @GetMapping(path = "/list", produces = "application/json")
    public ResponseEntity<ResponseDTO> list() {
        ResponseDTO response = service.list();
        return ResponseEntity.status(response.getStatus()).body(new ResponseDTO<>(response.getData(), response.getMessage(), response.getStatus()));
    }
}
