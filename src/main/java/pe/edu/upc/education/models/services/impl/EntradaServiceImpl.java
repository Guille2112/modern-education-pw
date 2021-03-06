package pe.edu.upc.education.models.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.education.models.entities.Entrada;
import pe.edu.upc.education.models.repositories.EntradaRepository;
import pe.edu.upc.education.models.services.EntradaService;

@Named
@ApplicationScoped
public class EntradaServiceImpl implements EntradaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntradaRepository entradaRepository;
	
	@Transactional
	@Override
	public Entrada save(Entrada entity) throws Exception {
		return entradaRepository.save(entity);
	}

	@Transactional
	@Override
	public Entrada update(Entrada entity) throws Exception {
		return entradaRepository.update(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		entradaRepository.deleteById(id);
	}

	@Override
	public Optional<Entrada> findById(Integer id) throws Exception {
		return entradaRepository.findById(id);
	}

	@Override
	public List<Entrada> findAll() throws Exception {
		return entradaRepository.findAll();
	}
}
