package com.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modelo.Proveedor;
import com.services.ProveedorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
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
