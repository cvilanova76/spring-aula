package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OlaMundoController {

    @GetMapping("/olamundo")
    public String olaMundo(){
            return "ola";
    }



    @GetMapping("/frasedeefeito")
    public String frase(Model model){
        model.addAttribute("frase", "A vida é bela");
        return "frase";
    }
}