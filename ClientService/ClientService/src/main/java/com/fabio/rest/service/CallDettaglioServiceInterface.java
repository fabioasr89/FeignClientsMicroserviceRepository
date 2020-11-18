package com.fabio.rest.service;

import com.fabio.rest.bean.BeanRisposta;

public interface CallDettaglioServiceInterface {
	BeanRisposta dettagliApi(String nome,String cognome);
}
