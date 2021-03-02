package com.facens.poo2.revisao.services;

import java.util.ArrayList;
import java.util.List;

import com.facens.poo2.revisao.dto.Clientdto;
import com.facens.poo2.revisao.entities.Client;
import com.facens.poo2.revisao.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Anotação Service -> Classe de serviço
@Service
public class ClientServices {

    //Injeção de dependência
    @Autowired
    private ClientRepository repository;

    public List<Clientdto> getClients(){

        List <Client> list = repository.getClients();

        List<Clientdto> listdto = new ArrayList<>();

        for(Client c: list){
            listdto.add(new Clientdto(c.getId(),c.getName()));
        }

        return listdto;

    }

}
