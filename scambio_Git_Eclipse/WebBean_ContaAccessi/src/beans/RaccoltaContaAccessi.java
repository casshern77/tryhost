package beans;

import java.util.ArrayList;

public class RaccoltaContaAccessi {
	
	ArrayList<ContaAccessi> raccoltaAccessi;
	
//===============================================================================
//costruttore
public RaccoltaContaAccessi() {
	raccoltaAccessi = new ArrayList<ContaAccessi>();
}
//===============================================================================
public void aggiungiAccesso(String pagina) {
	//scorro tutto l'array
	for(int i=0 ; i<raccoltaAccessi.size() ;i++) {
		//se nelle righe (colonna pagina) c'è una pagina = alla pagina input di questo metodo
		//allora incrementa la variabile contatore attaverso il metodo incrementa()
		if(raccoltaAccessi.get(i).getPagina().equals(pagina)) {
			raccoltaAccessi.get(i).incrementa();
//se ha trovato la pagina non c'è bisogno di iterare ancora l'array
			return; }//come return stoppo il metodo		
		}
//se finito il ciclo la pagina non c'è, allora la inserisco nell'array costruendo al suo interno
//un oggetto ContaAccessi che il metodo costruisce assegnando il nome pagina e 1
	raccoltaAccessi.add(new ContaAccessi(pagina));
	}
//===============================================================================
	public String StampaContaAccessi() {
		String stampa = "<table>";
		for(int i=0 ; i<raccoltaAccessi.size() ;i++) {
			stampa=stampa + raccoltaAccessi.get(i).toString();// + "\n";
			}
//il metodo toString presente nella classe ContaAccessi mi permette 
//di sovrascrivere il metodo toString di defauls che mi stamperebbe
//gli indirizzi di memoria anziché i valori dell'arraylist
			stampa=stampa+"</table>";
			return stampa;
	}
//===============================================================================

}
