package com.ecua.slb.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/filtroSLB")
	public ResponseEntity<List<XmlResultado>> indexslb( @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy){
		List<XmlResultado> list = xmlresultadoServices.findAllSLB(pageNo, pageSize, sortBy);
		 
        return new ResponseEntity<List<XmlResultado>>(list, new HttpHeaders(), HttpStatus.OK); 
		//return xmlresultadoServices.findAllEmpresa();
		
	}
	
	
	@GetMapping("/filtroSLBCompany")
	public ResponseEntity<List<XmlResultado>> indexslbcompany( @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy){
		List<XmlResultado> list = xmlresultadoServices.findAllSLB(pageNo, pageSize, sortBy);
		 
        return new ResponseEntity<List<XmlResultado>>(list, new HttpHeaders(), HttpStatus.OK); 
		//return xmlresultadoServices.findAllEmpresa();
		
	}
	
//	@GetMapping("/xmlresultados2")
//	public Page<XmlResultado> index2(@RequestParam(name="page",defaultValue = "10000") Integer page, Model model){
//
//				
//		Pageable pageRequest = PageRequest.of(page, 10);
//		Page<XmlResultado> xmlresultados = xmlresultadoServices.findAllEmpresaSLB(pageRequest);
//		//model.addAttribute("xmlResultados", xmlresultados );
//		
//		//return xmlresultadoServices.findAllEmpresa();
//		return  xmlresultados;
//	}
//	
	
	
	
}
