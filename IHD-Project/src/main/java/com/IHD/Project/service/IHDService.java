package com.IHD.Project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IHD.Project.data.IHDData;
import com.IHD.Project.data.SearchDTO;
import com.IHD.Project.repo.DataRepository;

@Service
public class IHDService {
	
	@Autowired
	private DataRepository datarepo;
	
	public String searchbar(SearchDTO query) {
		
		Optional<IHDData> IHD=datarepo.findById(query.getQuery());
		return IHD.get().getName();
	} 
}
