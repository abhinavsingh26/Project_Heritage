package com.IHD.Project.repo;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.IHD.Project.data.IHDData;

@Repository
public interface DataRepository extends SolrCrudRepository<IHDData, String> {

    public List<IHDData> findByName(String name);

   
//    @Query("id:*?0* OR name:*?0*")
//    public Page<IHDData> findByCustomQuery(String searchTerm, Pageable pageable);
//
//    @Query(name = "IHDData.findByNamedQuery")
//    public Page<IHDData> findByNamedQuery(String searchTerm, Pageable pageable);

}