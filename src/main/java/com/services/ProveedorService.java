package com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interfaces.ProveedorInterface;
import com.modelo.Proveedor;

@Service
public class ProveedorService {
	@Autowired
	ProveedorInterface proveedorInterface;
	
	//CREATE, UPDATE
	public Proveedor guardarProveedor(Proveedor proveedor) {
		return proveedorInterface.save(proveedor);
	}
			
	//READ
	public Optional<Proveedor> obtenerPorNit(Long nit) {
		return proveedorInterface.findById(nit);
	}
			
	//READ
	public ArrayList<Proveedor> obtenerProveedores() {
		return (ArrayList<Proveedor>)proveedorInterface.findAll();
	}
			
	//DELETE
	public boolean eliminarProveedor(Long nit) {
		try {
			if (proveedorInterface.existsById(nit)){
				Proveedor seller = proveedorInterface.findFirstByNitProveedor(nit);
				proveedorInterface.delete(seller);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

}