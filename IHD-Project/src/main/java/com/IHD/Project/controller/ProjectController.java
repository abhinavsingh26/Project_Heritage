package com.IHD.Project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.IHD.Project.data.AddDTO;
import com.IHD.Project.data.IHDData;
import com.IHD.Project.data.SearchDTO;
import com.IHD.Project.repo.DataRepository;

@ComponentScan
@RestController

public class ProjectController {
	
	@Autowired
	private DataRepository datarepo;
	
//	@RequestMapping("/index")
//    public String welcome() {
//        return "index";
//    }
	
	@PostMapping("/search")
	public String searchbar(@RequestBody SearchDTO query) {		
		Optional<IHDData> IHD=datarepo.findById(query.getQuery());
		return IHD.get().getName();
	} 
	
	@PostMapping("/add")
	public Boolean AddData(@RequestBody AddDTO data) {
		IHDData IHD = new IHDData();
		IHD.setId(data.getId());
		IHD.setName(data.getData());		
		datarepo.save(IHD);	 
		return true;
	} 

}


