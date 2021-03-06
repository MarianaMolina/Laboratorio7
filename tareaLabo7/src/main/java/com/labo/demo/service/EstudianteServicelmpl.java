package com.labo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.labo.demo.dao.EstudianteDAO;
import com.labo.demo.domain.Estudiante;
import com.labo.demo.service.EstudianteService;

@Service
public class EstudianteServicelmpl implements EstudianteService{
	
	@Autowired
	EstudianteDAO estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteDAO.findAll();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteDAO.findOne(code);
	}

	@Override
	@Transactional
	public void save(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDAO.save(estudiante);
		
	}

	@Override
	@Transactional
	public void delete(Integer codigoEstudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDAO.delete(codigoEstudiante);
	}

	@Override
	public void update(Integer codigoEstudiante, Estudiante nuevoEstudiante) throws DataAccessException {
		estudianteDAO.update(codigoEstudiante, nuevoEstudiante);
	}

}
