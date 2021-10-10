package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoProducto;
	private String nombreProducto;
	@Column(unique=true, nullable=false)
	private String nitProveedor;
	private float precioCompra;
	private float ivaCompra;
	private float precioVenta;
	
	public Producto() {
	}

	public Producto(long codigoProducto, String nombreProducto, String nit, float precioCompra, float ivaCompra, float precioVenta) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.nitProveedor = nit;
		this.precioCompra = precioCompra;
		this.ivaCompra = ivaCompra;
		this.precioVenta = precioVenta;
	}

	public long getCodigo() {
		return codigoProducto;
	}

	public void setCodigo(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombreProducto;
	}

	public void setNombre(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNit() {
		return nitProveedor;
	}

	public void setNit(String nit) {
		this.nitProveedor = nit;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getIvaCompra() {
		return ivaCompra;
	}

	public void setIvaCompra(float ivaCompra) {
		this.ivaCompra = ivaCompra;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigoProducto + ", nombre=" + nombreProducto + ", nit=" + nitProveedor + ", precioCompra=" + precioCompra
				+ ", ivaCompra=" + ivaCompra + ", precioVenta=" + precioVenta + "]";
	}

}
