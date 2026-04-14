package com.senai.pi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.models.Materiais;
import com.senai.pi.services.MateriaisService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/materiais")
public class MateriaisController {

    @Autowired
    public MateriaisService materiaisService;

    @GetMapping
    public List<Materiais> listar() {
        return materiaisService.listar();
    }

    @GetMapping("/{id}")
    public Materiais buscar(@PathVariable Integer id) {
        return materiaisService.buscarPorId(id);
    }

    @PostMapping
    public Materiais criar(@RequestBody Materiais material) {
        return materiaisService.salvar(material);
    }

    @PutMapping("/{id}")
    public Materiais atualizar(@PathVariable Integer id, @RequestBody Materiais material) {
        material.setId(id);
        return materiaisService.salvar(material);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        materiaisService.deletar(id);
    }
}
    
