package com.adriamilan.ptecnica.service;

import java.util.List;

import com.adriamilan.ptecnica.dto.Grupo;

public interface IGrupoService {

	public List<Grupo> listGrupos();
	
	public Grupo grupoXID(Long id);
	
	public Grupo grupoXNombre(String nombre);
	
	public Grupo saveGrupo(Grupo grupo);
	
	public Grupo editGrupo(Grupo grupo);
	
	public String deleteGrupo(Long id);
	
}
