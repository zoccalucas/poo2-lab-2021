package com.facens.poo2.revisao.repositories;

import java.util.ArrayList;
import java.util.List;

import com.facens.poo2.revisao.entities.Client;

import org.springframework.stereotype.Component;

//Component -> Spring que vai manipular
@Component
public class ClientRepository {
    
    public List<Client> getClients(){
        
        Client c1 = new Client();
        c1.setId(1l); //valor do id com l -> Recebe um Long
        c1.setName("Lucas");
        c1.setAddress("Retiro São João");

        Client c2 = new Client();
        c2.setId(2l); 
        c2.setName("Ana");
        c2.setAddress("Ibiti do Paço");

        //cria a lista 
        List<Client> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        
        return list;
    }
}
