
abstract public class Figurita {
	private int numeroSerie;
	private int ranking;
	private String pais;
	private int valorFinal;
	
	Figurita(int numeroSerie,int ranking, String pais,int valorFinal){
		if (numeroSerie < 0 || ranking <0) {
			throw new RuntimeException("Error: el numeroSerie o Ranking no puede ser menor a 0");
		}
		if (pais == null || pais =="" ) {
			throw new RuntimeException("Error: debe introducir un nombre");
		}
		
		this.numeroSerie = numeroSerie;
		this.ranking = ranking;
		this.pais = pais;
		this.valorFinal = valorFinal;
	}
}
