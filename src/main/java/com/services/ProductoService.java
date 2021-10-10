package com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interfaces.ProductoInterface;
import com.modelo.Producto;

@Service
public class ProductoService {
	@Autowired
	ProductoInterface productoInterface;
	
	//CREATE, UPDATE
	public Producto guardarProducto(Producto producto) {
		return productoInterface.save(producto);
	}
		
	//READ
	public Optional<Producto> obtenerPorCodigo(Long codigo) {
		return productoInterface.findById(codigo);
	}
		
	//READ
	public ArrayList<Producto> obtenerProductos() {
		return (ArrayList<Producto>)productoInterface.findAll();
	}
		
	//DELETE
	public boolean eliminarProducto(Long codigo) {
		try {
			productoInterface.existsById(codigo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

}
