package academias;
import planetas.Planeta;

public class Academia {
	private String nomeAcademia = null;
	private Planeta planetaAcademia;
	private String administracao = null;
	
	public Academia(String nomeAcademia, Planeta planetaAcademia, String administracao) {
		this.nomeAcademia = nomeAcademia;
		this.planetaAcademia = planetaAcademia;
		this.administracao = administracao;
	}
	
	public void setNomeAcademia(String nomeAcademia){
		this.nomeAcademia = nomeAcademia;
	}
	
	public String getNomeAcademia(){
		return nomeAcademia;
	}
	
	public Planeta getPlanetaAcademia(){
		return planetaAcademia;
	}
	
	public void setPlanetaAcademia(Planeta planetaAcademia){
		this.planetaAcademia = planetaAcademia;
	}
	
	public void setAdministracao(String administracao){
		this.administracao = administracao;
	}
	
	public String getAdministracao(){
		return administracao;
	}
}
