package com.adriamilan.ptecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.ptecnica.dto.Grupo;
import com.adriamilan.ptecnica.service.GrupoServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GrupoController {

	@Autowired
	GrupoServiceImpl gruposervice;
	
	@GetMapping("/grupos")
	public List<Grupo> listGrupos() {
		return gruposervice.listGrupos();
	}
	
	@GetMapping("/grupo/{id}")
	public Grupo grupoXID(@PathVariable(name="id") Long id) {
		return gruposervice.grupoXID(id);
	}
	
	@GetMapping("/grupo/{nombre}")
	public Grupo grupoXNombre(@PathVariable(name="nombre") String nombre) {
		return gruposervice.grupoXNombre(nombre);
	}
	
	@PostMapping("/grupo")
	public Grupo saveGrupo(@RequestBody Grupo grupo) {
		return gruposervice.saveGrupo(grupo);
	}
	
	@PutMapping("/grupo/{id}")
	public Grupo editGrupo(@PathVariable(name="id") Long id, @RequestBody Grupo grupo) {
		Grupo grupoSelected = new Grupo();
		Grupo grupoUpdated = new Grupo();

		grupoSelected = gruposervice.grupoXID(id);
		grupoSelected.setNombre(grupo.getNombre());
		grupoSelected.setVideojuego(grupo.getVideojuego());
		
		grupoUpdated = gruposervice.editGrupo(grupoSelected);
		
		return grupoUpdated;
	}
	
	@DeleteMapping("/grupo/{id}")
	public String deleteGrupo(@PathVariable(name="id") Long id) {
		return gruposervice.deleteGrupo(id);
	}
	
}
