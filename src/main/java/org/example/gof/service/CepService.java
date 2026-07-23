package org.example.gof.service;

import org.example.gof.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cep", url = "https://viacep.com.br/ws")
public interface CepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Address consultCep(@PathVariable("cep") String cep);
}
