package br.gcn.empresa.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // Todas as Strings retornadas por essa classe ele busca como arquivos da pasta RESOURCES/TEMPLATE
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home() {
        return "home.html";
    }
}
