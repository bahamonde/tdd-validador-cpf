package com.aline.tdd_bdd.validadorCpf.controllers;

import com.aline.tdd_bdd.validadorCpf.models.Cliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(){
    return "home/index";
  }

  @GetMapping("/valida-cpf")
  public String validaCpf(Cliente cliente, Model model){
    boolean verdade = cliente.validarCPF();
    model.addAttribute("verdade", verdade);
    return "home/cpfValidado";
  }
}
