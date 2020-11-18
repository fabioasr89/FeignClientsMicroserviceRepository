package com.fabio.rest.info;

import java.util.LinkedHashMap;
import java.util.Map;

public enum LavoroEnum {
	PROGRAMMATORE("Programmatore","Informatica",1),
	COMMERCIANTE("Commerciante","Commercio",2),
	ACCADEMICO("Accademico","Insegnamento",3),
	INGEGNERE("Ingegnere","Ingegneria",4);
	
	private String lavoro;
	private String settore;
	private Integer etichetta;
	private LavoroEnum(String lavoro,String settore,Integer etichetta) {
		this.lavoro=lavoro;
		this.settore=settore;
		this.etichetta=etichetta;
	}
	public String getLavoro() {
		return lavoro;
	}
	public void setLavoro(String lavoro) {
		this.lavoro = lavoro;
	}
	public String getSettore() {
		return settore;
	}
	public void setSettore(String settore) {
		this.settore = settore;
	}
	public Integer getEtichetta() {
		return etichetta;
	}
	public void setEtichetta(Integer etichetta) {
		this.etichetta = etichetta;
	}
	
	public static Map<String,String> findByLavoro(Integer etichetta) {
		Map<String,String> mappa=new LinkedHashMap<String,String>();
		for(LavoroEnum l:LavoroEnum.values()) {
			if(etichetta.equals(l.getEtichetta())) {
				mappa.put("lavoro",l.getLavoro() );
				mappa.put("settore", l.getSettore());
				break;
			}
		}
		return mappa;
	}
}
