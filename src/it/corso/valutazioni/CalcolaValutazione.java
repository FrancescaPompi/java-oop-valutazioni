package it.corso.valutazioni;

public class CalcolaValutazione {
	
	// attributi
	int idStudente;
	int percentualeAssenze;
	float mediaVoti;
	
	// metodi
	String valutazione(int percentualeAssenze, float mediaVoti) {
		if((this.percentualeAssenze <= 50 && this.percentualeAssenze >= 25) && this.mediaVoti > 2) {
			return "promosso";
		} else if(this.percentualeAssenze < 25 && this.mediaVoti >= 2) {
			return "promosso";
		} else {
			return "bocciato";
		}
		
	}
	
}
