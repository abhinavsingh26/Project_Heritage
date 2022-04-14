package com.IHD.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@EnableSolrRepositories(basePackages = {"com.IHD.Project.repo"})
@SpringBootApplication
public class IHDProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IHDProjectApplication.class, args);
	}

}
