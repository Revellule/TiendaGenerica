package com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interfaces.ClienteInterface;
import com.modelo.Cliente;

@Service
public class ClienteService {
	@Autowired
	ClienteInterface clienteInterface;
	
	//CREATE, UPDATE
	public Cliente guardarCliente(Cliente cliente) {
		return clienteInterface.save(cliente);
	}
	
	//READ
	public Optional<Cliente> obtenerPorCedula(Long cedula) {
		return clienteInterface.findById(cedula);
	}
	
	//READ
	public ArrayList<Cliente> obtenerClientes() {
		return (ArrayList<Cliente>)clienteInterface.findAll();
	}
	
	//DELETE
	public boolean eliminarCliente(Long cedula) {
		try {
			clienteInterface.existsById(cedula);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

}
