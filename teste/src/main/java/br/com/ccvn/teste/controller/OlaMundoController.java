package br.com.ccvn.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


 

@Controller
public class OlaMundoController {

    @GetMapping("/ola-mundo")
    public String olaMundo(Model model){
        model.addAttribute("nome", "João");
        return "ola";
    }
    
    @GetMapping("/frase-de-efeito")
    public String frase(Model model){
        model.addAttribute("frase", "A vida é bela");
        return "frase";
    }

}