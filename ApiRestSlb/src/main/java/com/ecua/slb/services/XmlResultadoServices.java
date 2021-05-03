package com.ecua.slb.services;

import java.util.List;

import com.ecua.slb.entity.XmlResultado;

public interface XmlResultadoServices {

	public List<XmlResultado> findAll();
	
	public List<XmlResultado> findAllEmpresa();
	
	public List<XmlResultado> findAllSLB(Integer pageNo, Integer pageSize, String sortBy);
	
	public List<XmlResultado> findAllSLBCompany(Integer pageNo, Integer pageSize, String sortBy);
	
	
}
