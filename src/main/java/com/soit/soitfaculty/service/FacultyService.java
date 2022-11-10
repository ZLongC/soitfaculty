package com.soit.soitfaculty.service;

public interface FacultyService {	
	public list<Faculty> findAll();
	
	public Faculty findByid(int theId);
	
	public void save(Faculty theFaculty);
	
	public void deleteById(int theId);
}
