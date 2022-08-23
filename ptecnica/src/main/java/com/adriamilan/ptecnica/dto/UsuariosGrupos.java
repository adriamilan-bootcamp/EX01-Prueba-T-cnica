package com.adriamilan.ptecnica.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UsuariosGrupos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	
	@ManyToOne
	@JoinColumn(name="grupo")
	private Grupo grupo;
	
	// Constructor por defecto
	public UsuariosGrupos() {
		
	}

	/**
	 * @param id
	 * @param usuario
	 * @param grupo
	 */
	public UsuariosGrupos(Long id, Usuario usuario, Grupo grupo) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.grupo = grupo;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the grupo
	 */
	public Grupo getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "UsuariosGrupos [id=" + id + ", usuario=" + usuario + ", grupo=" + grupo + "]";
	}
	
}
