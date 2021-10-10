package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modelo.Usuario;

@Repository
public interface UsuarioInterface extends CrudRepository<Usuario, Long>{

}
