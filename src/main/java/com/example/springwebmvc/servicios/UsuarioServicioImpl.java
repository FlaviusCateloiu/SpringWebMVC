package com.example.springwebmvc.servicios;

import java.util.ArrayList;
import java.util.List;
import com.example.springwebmvc.modelos.Usuario;
import com.example.springwebmvc.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> findAllUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public Usuario findUsuario(int id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    public Usuario findByNombreUsuario(String nombre) {
        return usuarioRepositorio.findByNombre(nombre);
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public void deleteUsuario(int id) {
        usuarioRepositorio.deleteById(id);
    }
}
