package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modelo.Usuario;

import java.util.List;

@Repository
public interface UsuarioInterface extends CrudRepository<Usuario, Long>{
    Usuario findFirstByCedulaUsuario (Long cedula);

}
