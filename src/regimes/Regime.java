package regimes;

public class Regime {
	private String nomeRegime = null;
	private int anoInicio = 0;
	private int anoFinal = 0;
	private String periodoInicio = null;
	private String periodoFinal = null;
	private String capital = null;
	private String chefeEstado = null;
	
	public Regime(String nomeRegime, int anoInicio, int anoFinal, String periodoInicio, String periodoFinal, String capital, String chefeEstado) {
		this.nomeRegime = nomeRegime;
		this.anoInicio = anoInicio;
		this.anoFinal = anoFinal;
		this.periodoInicio = periodoInicio;
		this.periodoFinal = periodoFinal;
		this.capital = capital;
		this.chefeEstado = chefeEstado;
	}
	
	public void setNomeRegime(String nomeRegime){
		this.nomeRegime = nomeRegime;
	}
	
	public String getNomeRegime(){
		return nomeRegime;
	}
	
	public void setAnoInicio(int anoInicio){
		this.anoInicio = anoInicio;
	}
	
	public int getAnoInicio(){
		return anoInicio;
	}
	
	public void setAnoFinal(int anoFinal){
		this.anoFinal = anoFinal;
	}
	
	public int getAnoFinal(){
		return anoFinal;
	}
	
	public void setPeriodoInicio(String periodoInicio){
		this.periodoInicio = periodoInicio;
	}
	
	public String getPeriodoInicio(){
		return periodoInicio;
	}
	
	public void setPeriodoFinal(String periodoFinal){
		this.periodoFinal = periodoFinal;
	}
	
	public String getPeriodoFinal(){
		return periodoFinal;
	}
	
	public void setCapital(String capital){
		this.capital = capital;
	}
	
	public String getCapital(){
		return capital;
	}
	
	public void setChefeEstado(String chefeEstado){
		this.chefeEstado = chefeEstado;
	}
	
	public String getChefeEstado(){
		return chefeEstado;
	}
}
