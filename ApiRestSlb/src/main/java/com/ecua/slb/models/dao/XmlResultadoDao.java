package com.ecua.slb.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ecua.slb.entity.XmlResultado;

//estecrupRepository es para normal
//public interface XmlResultadoDao extends CrudRepository<XmlResultado, Long> {
	
//utilizamos pagination and sorting
public interface XmlResultadoDao extends PagingAndSortingRepository<XmlResultado, Long> {

}
