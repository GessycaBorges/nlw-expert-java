package com.rocketseat.certification_nlw;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public String retornoPrimeiraController(){
        return "Criando minha primeira controller";
    }

}
