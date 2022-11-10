package com.soit.soitfaculty;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.soit.soitfaculty.service.FacultyService;

public class FacultyController {

	public FacultyService facultyService;
	
	public FacultyController(FacultyService theFacultyService) {
		facultyService = theFacultyService; 
	}
	
	//mapping for /list        string attribute+...
	@GetMapping("/list")
	public String listFaculties(Model theModel) {
		
		//retrive faculties from the database
		List<Faculty> theFaculties = facultySerivce.findAll();
		
		
		//Add faculties to the spring model
		theModel.addAttribute("faculties", theFaculties);
		
		return "list-faculties";
	}
}
