
package FiloniGioeleTreno;
/**
 * <b> classe treno <b>
 * <UL>
 * <LI> nome
 * <LI> destinazione
 * <LI> vagoni massimi
 * @author gioele
 *versione 1 
 */


public class Vagone {
	public String classe;
	public int PostiDisponibili;
	public int PostiOccupati;

	public Vagone(String classe, int postiDisponibili, int postiOccupati) {
		super();
		this.classe = classe;
		PostiDisponibili = postiDisponibili;
		PostiOccupati = postiOccupati;
	}

	public int getPostiDisponibili() {
		return PostiDisponibili;
	}

	public void setPostiDisponibili(int postiDisponibili) {
		PostiDisponibili = postiDisponibili;
	}

	public int getPostiOccupati() {
		return PostiOccupati;
	}

	public void setPostiOccupati(int postiOccupati) {
		PostiOccupati = postiOccupati;
	}

	public String getClasse() {
		return classe;
	}
	/**
	 * @return metodo che restituisce il treno completo
	 */
	public String toString() {
		return "vagone1 [classe=" + classe + ", PostiDisponibili=" + PostiDisponibili + ", PostiOccupati="
				+ PostiOccupati + "]";
	}

public static void main(String[] args) {
	
	
}

}