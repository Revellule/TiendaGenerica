package com.modelo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="ventas")
public class Venta {
	@Id
	private long codigoVenta;
	private float ivaVenta;
	private float valorVenta;
	private float totalVenta;
	@ManyToOne
	@JoinColumn(name = "cedula_cliente")
	private Cliente cedulaCliente;
	@ManyToOne
	@JoinColumn(name = "cedula_usuario")
	private Usuario cedulaUsuario;
	@ManyToMany(cascade=CascadeType.MERGE)
	private List<Producto> productos;
	
	public Venta() {
	}

	public Venta(long codigoVenta, float ivaVenta, float valorVenta, float totalVenta, Cliente cedulaCliente,
			Usuario cedulaUsuario) {
		super();
		this.codigoVenta = codigoVenta;
		this.ivaVenta = ivaVenta;
		this.valorVenta = valorVenta;
		this.totalVenta = totalVenta;
		this.cedulaCliente = cedulaCliente;
		this.cedulaUsuario = cedulaUsuario;
	}

	public long getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(long codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public float getIvaVenta() {
		return ivaVenta;
	}

	public void setIvaVenta(float ivaVenta) {
		this.ivaVenta = ivaVenta;
	}

	public float getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(float valorVenta) {
		this.valorVenta = valorVenta;
	}

	public float getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}

	public Cliente getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(Cliente cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public Usuario getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(Usuario cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	@Override
	public String toString() {
		return "Venta [codigoVenta=" + codigoVenta + ", ivaVenta=" + ivaVenta + ", valorVenta=" + valorVenta
				+ ", totalVenta=" + totalVenta + ", cedulaCliente=" + cedulaCliente + ", cedulaUsuario=" + cedulaUsuario
				+ "]";
	}

	public String toString2() {
		return "Lista Productos [lista=" + productos +"]";
	}
	
	
}
