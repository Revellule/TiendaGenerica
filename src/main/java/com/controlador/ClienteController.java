package com.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modelo.Cliente;
import com.services.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public ArrayList<Cliente> obtenerClientes() {
		return clienteService.obtenerClientes();
	}
	
	@PostMapping
	public Cliente crearCliente(@RequestBody Cliente cliente) {
		return clienteService.guardarCliente(cliente);
	}
	
	@GetMapping(path="{cedula}")
	public Optional<Cliente> obtenerPorCedula(@PathVariable("cedula") Long cedula) {
		return clienteService.obtenerPorCedula(cedula);
	}
	
	@DeleteMapping(path="{cedula}")
	public String eliminarClientePorCedula(@PathVariable("cedula") Long cedula) {
		boolean eliminado=clienteService.eliminarCliente(cedula);
		if(eliminado) return "Cliente Eliminado";
		else return "Error Eliminando Cliente";
	}

}
