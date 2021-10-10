package com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interfaces.UsuarioInterface;
import com.modelo.Usuario;

@Service
public class UsuarioService {
	@Autowired
	UsuarioInterface usuarioInterface;
	
	//CREATE, UPDATE
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioInterface.save(usuario);
	}
				
	//READ
	public Optional<Usuario> obtenerPorCedula(Long cedula) {
		return usuarioInterface.findById(cedula);
	}
				
	//READ
	public ArrayList<Usuario> obtenerUsuarios() {
		return (ArrayList<Usuario>)usuarioInterface.findAll();
	}
				
	//DELETE
	public boolean eliminarUsuario(Long cedula) {
		try {
			usuarioInterface.existsById(cedula);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

}
