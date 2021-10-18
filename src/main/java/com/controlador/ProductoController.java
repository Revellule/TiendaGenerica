package com.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modelo.Producto;
import com.services.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@GetMapping
	public ArrayList<Producto> obtenerProductos() {
		return productoService.obtenerProductos();
	}
	
	@PostMapping
	public Producto crearProducto(@RequestBody Producto producto) {
		return productoService.guardarProducto(producto);
	}
	
	@GetMapping(path="{codigo}")
	public Optional<Producto> obtenerPorCodigo(@PathVariable("codigo") Long codigo) {
		return productoService.obtenerPorCodigo(codigo);
	}
	
	@DeleteMapping(path="{codigo}")
	public String eliminarProductoPorCodigo(@PathVariable("codigo") Long codigo) {
		boolean eliminado=productoService.eliminarProducto(codigo);
		if(eliminado) return "Producto Eliminado";
		else return "Error Eliminando Producto";
	}

}
