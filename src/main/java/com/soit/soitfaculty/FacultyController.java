package com.soit.soitfaculty;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.soit.soitfaculty.service.FacultyService;

public class FacultyController {

	public FacultyService facultyService;
	
	public FacultyController(FacultyService theFacultyService) {
		facultyService = theFacultyService; 
	}
	
	//mapping for /list        string attribute+...
	@GetMapping("/list")
	public String listFaculties(Model theModel) {
		
		//retrieve faculties from the database
		List<Faculty> theFaculties = facultySerivce.findAll();
		
		
		//Add faculties to the spring model
		theModel.addAttribute("faculties", theFaculties);
		
		return "faculties/list-faculties";
	}
	
	@GetMapping("/viewAddForm")
	public String viewAddForm(Model theModel) {
		//Model attribute for data binding
		Faculty theFaulty=new Faculty();
		
		theModel.addAttribute("faculty", theFaulty);
		
		return "faculties/faculty-form";
	}
	
	@PostMapping("/save")
	public String saveFaculty(@ModelAttribute("faculty") Faculty theFaculty) {
		//register the faculty
		facultyService.save(theFaculty);
		
		
		//block duplicates submission for accidental refresh
		return "redirect:/Faculties/list";
	}
}
