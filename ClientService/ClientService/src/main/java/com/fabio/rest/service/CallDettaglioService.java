package com.fabio.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabio.rest.bean.BeanRisposta;
import com.fabio.rest.feign.DettagliServiceProxy;

@Service
public class CallDettaglioService implements CallDettaglioServiceInterface{
	
	@Autowired
	private DettagliServiceProxy proxy;
	
	@Override
	public BeanRisposta dettagliApi(String nome, String cognome) {
		
		return proxy.dettagliApi(nome, cognome);
	}

}
