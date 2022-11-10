package com.soit.soitfaculty.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.soitfaculty.entity.faculty;

public interface FacultyRepository extends JpaRepository<faculty, Integer> {
	public List<Faculty>findAllbYOrderByLastName();
}
