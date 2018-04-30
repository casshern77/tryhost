package beans;

public class ContaAccessi {
	
	private String pagina;
	private int contatore;
//===============================================================================
//costruttore
	public ContaAccessi(String pagina) {
		this.pagina = pagina;
		this.contatore = 1;
	}
//===============================================================================
	public void incrementa() {
		contatore++;
	}
//===============================================================================
	public String getPagina() {
		return pagina;
	}
	
	public int getContatore() {
		return contatore;
	}

//===============================================================================
	@Override
	public String toString() {
		return "<tr><td>"+pagina+"</td><td>"+contatore+"</td></tr>";
		}
//===============================================================================

}
