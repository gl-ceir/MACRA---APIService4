package com.ceir.CeirCode.repo.app;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.ceir.CeirCode.model.app.SystemConfigurationDb;
//
//@Repository
//public interface SystemConfigurationDbRepository extends JpaRepository<SystemConfigurationDb, Long> {
//	public SystemConfigurationDb getByTag(String tag);
//	public SystemConfigurationDb getById(Long id);
//	public List<SystemConfigurationDb> findByActiveAndTag(Integer active, String tag);
//}

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceir.CeirCode.model.app.SystemConfigurationDb;


@Repository
public interface SystemConfigurationDbRepository extends JpaRepository<SystemConfigurationDb, Long>{

	public SystemConfigurationDb getByTag(String tag);

	public SystemConfigurationDb getById(Long id);
	
//	public List<SystemConfigurationDb> findByTagAndActive(String tag, Integer active);
	
	public List<SystemConfigurationDb> findByActiveAndTag(Integer active, String tag);
	
	@Query("SELECT DISTINCT s.featureName FROM SystemConfigurationDb s")
	public List<String> findDistinctFeatureName();

}