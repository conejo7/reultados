package com.ecua.slb.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecua.slb.entity.XmlResultado;
import com.ecua.slb.services.XmlResultadoServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class XmlResultadoRestController {

	@Autowired
	private XmlResultadoServices xmlresultadoServices;
	
	@GetMapping("/xmlresultados")
	public List<XmlResultado> index(){
//		Query query = em.createQuery("SELECT obj FROM Cliente obj WHERE obj.cedula = ?1");
//        query.setParameter(1, cedula);
//        List<Cliente> cliente = query.getResultList();
//        
//        if(cliente.size() > 0) {
//            return cliente.get(0);
//        } else
//            return null;
//       }
		List<XmlResultado> resultados = xmlresultadoServices.findAll();
		for (Iterator iterator = resultados.iterator(); iterator.hasNext();) {
			XmlResultado xmlResultado = (XmlResultado) iterator.next();
			if (xmlResultado.getEmpresa().equals("AVON")) {
				System.out.println();
				resultados.add(xmlResultado);
				return resultados;
			}
		}
		
		//return xmlresultadoServices.findAll();
		return resultados;
		
	}
	
}
