package br.com.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.webservice.ExemploService")
public class ExemploServiceImplementacao implements ExemploService{
    @Override
    public int calcula(int id) {
        return id + 10;
    }

    @Override
    public String meuNome() { return "Mateus de Morais Tostes Cruz"; }
}
