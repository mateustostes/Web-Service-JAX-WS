package br.com.webservice.cliente;

import java.net.URL;

public class Cliente {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/exemplo?wsdl");

        ExemploServiceImplementacaoService exemploServiceImplementacaoService = new ExemploServiceImplementacaoService(url);
        ExemploService exemploService = exemploServiceImplementacaoService.getExemploServiceImplementacaoPort();

        System.out.println(exemploService.calcula(10));
        System.out.println(exemploService.meuNome());
    }
}