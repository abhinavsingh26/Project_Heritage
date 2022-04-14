package com.IHD.Project;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;

@Configuration
public class AppConfig {
	
	@Bean
    public SolrClient solrClient() {
        return new HttpSolrClient.Builder("http://localhost:8983/solr").build();
    }

	@Bean
	public SolrTemplate solrTemplate(SolrClient client) throws Exception {
       return new SolrTemplate(client);
    }

}
