package com.senai.pi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.services.MovimentacoesMateriaisService;

@RestController
@RequestMapping("/movimentacoes_materiais")
public class MovimentacoesMateriaisController {

    @Autowired
    public MovimentacoesMateriaisService movimentacoesMateriaisService;
    
}
