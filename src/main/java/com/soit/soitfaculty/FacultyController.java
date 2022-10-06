package com.soit.soitfaculty;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FacultyController {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PostConstruct
	private void loadData() {
		
		
		//
		Faculty fac1=new Faculty(1)
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//mapping for /list        string attribute+...
	@GetMapping("/list")
	public String listFaculties(Model theModel) {
		
		
		
		//Add faculties to the spring model
		theModel.addAttribute("faculties", theFaculties);
		
		return "list-faculties";
	}
}
