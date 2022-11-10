package com.soit.soitfaculty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.soitfaculty.dao.FacultyRepository;
import com.soit.soitfaculty.entity.faculty;

@Service
public class FacultyServicelmpl implements FacultyService {

	private FacultyRepository facultyRepository;
	
	@Autowired
	public FacultyServicelmpl (FacultyRepository theFacultyRepository) {
		facultyRepository = theFacultyRepository;
	}
	 
	@Override
	public List<Faculty> findAll(){
		return facultyRepository.findAllbYOrderByLastName();
	}
	
	@Override
	Public Faculty 

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
