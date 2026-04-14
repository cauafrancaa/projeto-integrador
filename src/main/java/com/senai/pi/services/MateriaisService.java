package com.senai.pi.services;

import com.senai.pi.repositories.MateriaisRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.models.Materiais;

@Service
public class MateriaisService {

    @Autowired
    public MateriaisRepository materiaisRepository;

    public List<Materiais> listar() {
        return materiaisRepository.findAll();
    }

    public Materiais buscarPorId(Integer id) {
        return materiaisRepository.findById(id).get();
    }

    public Materiais salvar(Materiais material) {
        return materiaisRepository.save(material);
    }

    public Materiais atualizar(Integer id, Materiais material) {
        Materiais existente = buscarPorId(id);
        existente.setDescricao(material.getDescricao());
        existente.setQuantidade(material.getQuantidade());
        existente.setCategorias(material.getCategorias());
        return materiaisRepository.save(existente);
    }

    public void deletar(Integer id) {
        materiaisRepository.deleteById(id);
    }
}
