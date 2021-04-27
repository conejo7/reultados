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

		
		return xmlresultadoServices.findAll();
		//return resultados;
		
	}
	
	@GetMapping("/xmlresultados1")
	public List<XmlResultado> index1(){

		return xmlresultadoServices.findAllEmpresa();
		
	}
	
}
