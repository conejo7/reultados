package com.ecua.slb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.ecua.slb.entity.XmlResultado;
import com.ecua.slb.models.dao.XmlResultadoDao;

@Service
public class XmlResultadoImp implements XmlResultadoServices {

	@Autowired
	private XmlResultadoDao xmlResultadoDao;
	
	
	@Override	
	public List<XmlResultado> findAll() {
		// TODO Auto-generated method stub
		return (List<XmlResultado>) xmlResultadoDao.findAll();
	}

}
