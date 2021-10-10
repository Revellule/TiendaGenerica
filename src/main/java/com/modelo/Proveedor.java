package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {
	@Id
	@Column(unique=true, nullable=false)
	private long nitProveedor;
	private String nombreProveedor;
	private String telefonoProveedor;
	private String ciudadProveedor;
	private String direccionProveedor;
	
	public Proveedor() {
	}

	public Proveedor(long nitProveedor, String nombreProveedor, String telefonoProveedor, String ciudadProveedor, String direccionProveedor) {
		super();
		this.nitProveedor = nitProveedor;
		this.nombreProveedor = nombreProveedor;
		this.telefonoProveedor = telefonoProveedor;
		this.ciudadProveedor = ciudadProveedor;
		this.direccionProveedor = direccionProveedor;
	}

	public long getNit() {
		return nitProveedor;
	}

	public void setNit(long nitProveedor) {
		this.nitProveedor = nitProveedor;
	}

	public String getNombre() {
		return nombreProveedor;
	}

	public void setNombre(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getTelefono() {
		return telefonoProveedor;
	}

	public void setTelefono(String telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	public String getCiudad() {
		return ciudadProveedor;
	}

	public void setCiudad(String ciudadProveedor) {
		this.ciudadProveedor = ciudadProveedor;
	}

	public String getDireccion() {
		return direccionProveedor;
	}

	public void setDireccion(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	@Override
	public String toString() {
		return "Proveedor [nit=" + nitProveedor + ", nombre=" + nombreProveedor + ", telefono=" + telefonoProveedor + ", ciudad=" + ciudadProveedor
				+ ", direccion=" + direccionProveedor + "]";
	}
	
}
