package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@Column(unique=true, nullable=false)
	private long cedulaUsuario;
	private String usuario;
	private String password;
	private String nombreUsuario;
	private String correoUsuario;
	
	public Usuario() {
	}

	public Usuario(long cedulaUsuario, String usuario, String password, String nombreUsuario, String correoUsuario) {
		super();
		this.cedulaUsuario = cedulaUsuario;
		this.usuario = usuario;
		this.password = password;
		this.nombreUsuario = nombreUsuario;
		this.correoUsuario = correoUsuario;
	}

	public long getCedula() {
		return cedulaUsuario;
	}

	public void setCedula(long cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombreUsuario;
	}

	public void setNombre(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreo() {
		return correoUsuario;
	}

	public void setCorreo(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	@Override
	public String toString() {
		return "usuario [cedula=" + cedulaUsuario + ", usuario=" + usuario + ", contraseña=" + password + ", nombre="
				+ nombreUsuario + ", correo=" + correoUsuario + "]";
	}
	
}
