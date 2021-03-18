package br.com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ExemploService {
    @WebMethod
    int calcula(int id);

    @WebMethod
    String meuNome();
}
