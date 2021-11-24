package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		CalcolaValutazione[] randomStudenti = new CalcolaValutazione[20]; 
		
		Random random = new Random();
		
		int idStudente = 0;
		int percentualeAssenze;
		float mediaVoti;
		float max = 5.0F;
		
		for(int i = 0; i < randomStudenti.length; i++) {
			percentualeAssenze = random.nextInt(100);
			mediaVoti = random.nextFloat() * max;
			
			randomStudenti[i] = new CalcolaValutazione(idStudente, percentualeAssenze, mediaVoti);
			idStudente = i + 1;
			
			System.out.println("Lo studente con id numero " + idStudente + " è " + randomStudenti[i].valutazione(percentualeAssenze, mediaVoti));
			
			// System.out.println(randomStudenti[i].mediaVoti + " " + randomStudenti[i].percentualeAssenze);
		}
		
	}

}
