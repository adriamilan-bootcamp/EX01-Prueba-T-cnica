package com.adriamilan.ptecnica.service;

import java.util.List;

import com.adriamilan.ptecnica.dto.UsuariosGrupos;

public interface IUsuariosGruposService {

	public List<UsuariosGrupos> listUsuariosGrupos();
	
	public UsuariosGrupos usuariosGruposXID(Long id);
	
	public UsuariosGrupos usuariosGruposXUsuario(String nombre);
	
	public UsuariosGrupos usuariosGruposXGrupo(String grupo);
	
	public UsuariosGrupos saveUsuariosGrupos(UsuariosGrupos usuariosGrupos);
	
	public UsuariosGrupos editUsuariosGrupos(UsuariosGrupos usuariosGrupos);
	
	public String deleteUsuariosGrupos(Long id);
	
}
