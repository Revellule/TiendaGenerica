package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@Column(unique=true, nullable=false)
	private long cedulaCliente;
	private String telefonoCliente;
	private String nombreCliente;
	private String correoCliente;
	private String direccionCliente;
	
	public Cliente() {
	}

	public Cliente(long cedulaCliente, String telefonoCliente, String nombreCliente, String correoCliente, String direccionCliente) {	
		this.cedulaCliente = cedulaCliente;
		this.telefonoCliente = telefonoCliente;
		this.nombreCliente = nombreCliente;
		this.correoCliente = correoCliente;
		this.direccionCliente = direccionCliente;
	}

	public long getCedula() {
		return cedulaCliente;
	}

	public void setCedula(long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public String getTelefono() {
		return telefonoCliente;
	}

	public void setTelefono(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getNombre() {
		return nombreCliente;
	}

	public void setNombre(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getCorreo() {
		return correoCliente;
	}

	public void setCorreo(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getDireccion() {
		return direccionCliente;
	}

	public void setDireccion(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedulaCliente + ", telefono=" + telefonoCliente + ", nombre=" + nombreCliente + ", correo=" + correoCliente
				+ ", direccion=" + direccionCliente + "]";
	}	
	
}
