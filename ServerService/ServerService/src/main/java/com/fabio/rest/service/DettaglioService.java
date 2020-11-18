package com.fabio.rest.service;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.fabio.rest.bean.BeanRichiesta;
import com.fabio.rest.bean.BeanRisposta;
import com.fabio.rest.info.LavoroEnum;

@Service
public class DettaglioService {

	public DettaglioService() {
		
	}
	
	public BeanRisposta getDettaglioResponse(BeanRichiesta richiesta) {
		BeanRisposta risposta=new BeanRisposta();
		Random rand=new Random();
		Integer eta=0;
		Integer codLavoro=0;
		Map<String,String> mappa=null;
		try {
			eta=rand.nextInt(99)+18;
			codLavoro=rand.nextInt(4)+1;
			mappa=LavoroEnum.findByLavoro(codLavoro);
			risposta.setNome(richiesta.getNome());
			risposta.setCognome(richiesta.getCognome());
			risposta.setEta(String.format("%d anni",eta));
			risposta.setProfessione(mappa.get("lavoro"));
			risposta.setSettore(mappa.get("settore"));
			risposta.setEsito(true);
			risposta.setMessage("Informazioni correttamente recuperate");
		}catch(Exception e) {
			e.printStackTrace();
			risposta.setEsito(false);
			risposta.setMessage("Errore nella fase di processo del dato");
		}
		return risposta;
	}
}
