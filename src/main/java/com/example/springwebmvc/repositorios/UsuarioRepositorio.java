package com.example.springwebmvc.repositorios;

import com.example.springwebmvc.modelos.Usuario;
import org.springframework.data.repository.ListCrudRepository;

public interface UsuarioRepositorio extends ListCrudRepository<Usuario, Integer> {
}
