package com.fome.ordersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fome.ordersystem.model.Pessoa;

@Controller
public class HomeController {

    @GetMapping("home") // <- acessa direto na porta 8080
    public String home(Model model) { // metodo para retornar o index quando a pagina for acessada
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fome :)");
        model.addAttribute("name", pessoa);
        model.addAttribute("outroname", "dor");
        return "index";
    }

}
