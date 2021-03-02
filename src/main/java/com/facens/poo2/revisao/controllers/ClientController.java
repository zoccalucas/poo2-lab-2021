package com.facens.poo2.revisao.controllers;

import java.util.List;

import com.facens.poo2.revisao.dto.Clientdto;
import com.facens.poo2.revisao.services.ClientServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotação RestController -> Para ser uma classe controladora
@RestController 

//Anotação RequestMapping -> Para mapear o endpoint (caminho/rota) 
@RequestMapping("/clients")

public class ClientController {

    //Injeção de dependência
    @Autowired
    private ClientServices service;

    //GetMapping -> define o endpoint usando o método Get
    @GetMapping

    //ResponseEntity -> retorna o status HTTP 
    public ResponseEntity<List<Clientdto>> getClient() //retorna ClientDTO
    {
        List <Clientdto> list = service.getClients();
        return ResponseEntity.ok().body(list);
    }  
    
    
}
