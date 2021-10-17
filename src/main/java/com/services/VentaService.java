package com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interfaces.VentaInterface;
import com.modelo.Venta;

@Service
public class VentaService {
	@Autowired
	VentaInterface ventaInterface;
	
	//CREATE, UPDATE
	public Venta guardarVenta(Venta venta) {
		return ventaInterface.save(venta);
	}
					
	//READ
	public Optional<Venta> obtenerPorCodigo(Long codigo) {
		return ventaInterface.findById(codigo);
	}
					
	//READ
	public ArrayList<Venta> obtenerVentas() {
		return (ArrayList<Venta>)ventaInterface.findAll();
	}
					
	//DELETE
	public boolean eliminarVenta(Long codigo) {
		try {
			if (ventaInterface.existsById(codigo)){
				Venta sold = ventaInterface.findFirstByCodigoVenta(codigo);
				ventaInterface.delete(sold);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

}