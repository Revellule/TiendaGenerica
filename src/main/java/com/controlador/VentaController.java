package com.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modelo.Venta;
import com.services.VentaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/ventas")
public class VentaController {
	@Autowired
	VentaService ventaServie;
	
	@GetMapping
	public ArrayList<Venta> obtenerVentas() {
		return ventaServie.obtenerVentas();
	}
	
	@PostMapping
	public Venta crearVenta(@RequestBody Venta venta) {
		return ventaServie.guardarVenta(venta);
	}
	
	@GetMapping(path="{codigo}")
	public Optional<Venta> obtenerPorCodigo(@PathVariable("codigo") Long codigo) {
		return ventaServie.obtenerPorCodigo(codigo);
	}
	
	@DeleteMapping(path="{codigo}")
	public String eliminarVentaPorCodigo(@PathVariable("codigo") Long codigo) {
		boolean eliminado=ventaServie.eliminarVenta(codigo);
		if(eliminado) return "Venta Eliminada";
		else return "Error Eliminando Venta";
	}

}
