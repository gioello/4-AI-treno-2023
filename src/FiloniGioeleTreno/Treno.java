package FiloniGioeleTreno;

public class Treno {
	private String nome, destinazione;
	private int numV;
	private Vagone[] vagoni;

public Treno(String destinazione, int numV, String nome) {
	super();
	this.destinazione = destinazione;
	this.numV = numV;
	vagoni=new Vagone[numV];
}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String d) {
		this.destinazione = d;
	}

public void setVagoni(Vagone[] vagoni) {
	this.vagoni = vagoni;
}
//aggiunta oggetto ad array
public boolean addVagone(int pos, Vagone vag) {
	vagoni[pos]= vag;
	
	return true;
}

public String toString() {
	String s= "nome treno: "+nome+"destinazione"+destinazione+"vagoni"+numV;
	for(int i=0; i< vagoni.length; i++) {
		s+= vagoni[i];
	}
	return s;
}
public static void main(String[] args) {
	Treno t1 = new Treno("Freccia rossa" , 10 , "milano");
	System.out.println(t1);
}
}