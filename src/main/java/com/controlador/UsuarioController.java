package com.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.Usuario;
import com.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ArrayList<Usuario> obtenerUsuarios() {
		return usuarioService.obtenerUsuarios();
	}
	
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioService.guardarUsuario(usuario);
	}
	
	@GetMapping(path="{cedula}")
	public Optional<Usuario> obtenerPorCedula(@PathVariable("cedula") Long cedula) {
		return usuarioService.obtenerPorCedula(cedula);
	}
	
	@DeleteMapping(path="{cedula}")
	public String eliminarUsuarioPorCedula(@PathVariable("cedula") Long cedula) {
		boolean eliminado=usuarioService.eliminarUsuario(cedula);
		if(eliminado) return "Usuario Eliminado";
		else return "Error Eliminando Usuario";
	}

}
