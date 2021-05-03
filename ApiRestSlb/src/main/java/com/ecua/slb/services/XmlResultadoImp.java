package com.ecua.slb.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

	@Override
	public List<XmlResultado> findAllEmpresa() {
		List<XmlResultado> xmlresultados = new ArrayList<XmlResultado>();
		List<XmlResultado> resultados = (List<XmlResultado>) xmlResultadoDao.findAll();
		
		System.out.println("resultados"+resultados);	
		for (Iterator iterator = resultados.iterator(); iterator.hasNext();) {
			XmlResultado xmlResultado = (XmlResultado) iterator.next();
			if (xmlResultado.getIdOrden()==1381812) {
				System.out.println("in"+xmlResultado.getIdOrden());
				xmlresultados.add(xmlResultado);
		//	return resultados;
			}
//			else {
//				System.out.println("off"+xmlResultado.getIdOrden());
//				xmlresultados.add(xmlResultado);
//				//return resultados;
//			}
		}
		
		//return null;
		return xmlresultados;
	}
	
	public List<XmlResultado> findAllSLB(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
 
        Page<XmlResultado> pagedResult = xmlResultadoDao.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<XmlResultado>();
        }
    }
	
	public List<XmlResultado> findAllSLBCompany(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("id").ascending());
 
        Page<XmlResultado> pagedResult = xmlResultadoDao.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<XmlResultado>();
        }
    }



}
