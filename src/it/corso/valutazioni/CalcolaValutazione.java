package it.corso.valutazioni;

public class CalcolaValutazione {
	
	// attributi
	int idStudente;
	int percentualeAssenze;
	float mediaVoti;
	
	// costruttore
	CalcolaValutazione(int idStudente, int percentualeAssenze, float mediaVoti) {
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	// metodo
	String valutazione(int percentualeAssenze, float mediaVoti) {
		if((this.percentualeAssenze <= 50 && this.percentualeAssenze >= 25) && this.mediaVoti > 2.0F) {
			return "promosso";
		} else if(this.percentualeAssenze < 25 && this.mediaVoti >= 2.0F) {
			return "promosso";
		} else {
			return "bocciato";
		}
		
	}
	
}
