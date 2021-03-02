package com.facens.poo2.revisao.dto;

//No dto eu retorno apenas o que quero devolver ao meu cliente
public class Clientdto {

    private Long id;
    private String name;

    public Clientdto() {
	}

    public Clientdto(Long id, String name) {
        setId(id);
        setName(name);
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
