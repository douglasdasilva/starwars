
public class Academia {
	private String nomeAcademia = null;
	private Planeta planetaAcademia;
	private String administracao = null;
	
	public void setNomeAcademia(String nomeAcademia){
		this.nomeAcademia = nomeAcademia;
	}
	
	public String getNomeAcademia(){
		return nomeAcademia;
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
