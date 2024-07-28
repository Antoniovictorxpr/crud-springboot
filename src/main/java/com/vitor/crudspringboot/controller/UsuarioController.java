package com.vitor.crudspringboot.controller;

import com.vitor.crudspringboot.model.entity.Usuario;
import com.vitor.crudspringboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
@Service
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    public Usuario getUsuario(String cpf) throws Exception {
        Usuario usuario = this.repository.findByCpf(cpf);
        if (usuario == null){
            throw new Exception("Usuario nao encontrado");
        }

        return  usuario;
    }

    public List<Usuario> getAll(){
        return  this.repository.findAll();
    }

    public Usuario save(Usuario usuario) throws Exception {
        if (!StringUtils.hasLength(usuario.getCpf())){
            throw new Exception("Cpf Vazio");
        }

        if (!StringUtils.hasLength(usuario.getNome())){
            throw new Exception("Nome Vazio");
        }

        if (!StringUtils.hasLength(usuario.getEmail())){
            throw new Exception("Email Vazio");
        }

        return  this.repository.save(usuario);
    }
    public void delete(String cpf) throws Exception {
        this.repository.delete(getUsuario(cpf));
    }




}
