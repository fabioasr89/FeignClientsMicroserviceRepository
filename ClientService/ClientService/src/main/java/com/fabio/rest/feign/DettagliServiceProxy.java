package com.fabio.rest.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fabio.rest.bean.BeanRisposta;


@FeignClient(value="dettagliService",url="http://localhost:8080/DettagliLavoratoreAPI/")
public interface DettagliServiceProxy {
	
	@RequestMapping(value="dettaglio/{nome}/and/{cognome}",method=RequestMethod.GET)
	public BeanRisposta dettagliApi(@PathVariable String nome,@PathVariable String cognome);
	
}