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

import com.modelo.Proveedor;
import com.services.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
	@Autowired
	ProveedorService proveedorService;
	
	@GetMapping
	public ArrayList<Proveedor> obtenerProveedores() {
		return proveedorService.obtenerProveedores();
	}
	
	@PostMapping
	public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
		return proveedorService.guardarProveedor(proveedor);
	}
	
	@GetMapping(path="{nit}")
	public Optional<Proveedor> obtenerPorNit(@PathVariable("nit") Long nit) {
		return proveedorService.obtenerPorNit(nit);
	}
	
	@DeleteMapping(path="{nit}")
	public String eliminarProveedorPorNit(@PathVariable("nit") Long nit) {
		boolean eliminado=proveedorService.eliminarProveedor(nit);
		if(eliminado) return "Proveedor Eliminado";
		else return "Error Eliminando Proveedor";
	}

}
