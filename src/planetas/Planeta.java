package planetas;

public class Planeta {
	private String nomePlaneta = null;
	private String cor = null;
	private String sistema = null;
	private double diametro = 0;
	private String regime = null;
	
	public void setNomePlaneta(String nomePlaneta){
		this.nomePlaneta = nomePlaneta;
	}
	
	public String getNomePlaneta(){
		return nomePlaneta;
	}
	
	public void setDiametro(float diametro){
		this.diametro = diametro;
	}
	
	public double getDiametro(){
		return diametro;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void setSistema(String sistema){
		this.sistema = sistema;
	}
	
	public String getSistema(){
		return sistema;
	}
	
	public void setRegime(String regime){
		this.regime = regime;
	}
	
	public String getRegime(){
		return regime;
	}
	
	public Planeta(String nomePlaneta, String cor, String sistema, double diametro, String regime) {
		this.nomePlaneta = nomePlaneta;
		this.cor = cor;
		this.sistema = sistema;
		this.diametro = diametro;
		this.regime = regime;
	}
}
