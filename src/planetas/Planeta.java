package planetas;

import java.awt.Color;
import regimes.*;

public class Planeta {
	private String nomePlaneta = null;
	private Color cor = null;
	private String sistema = null;
	private double diametro = 0;
	private Regime regime = null;
//	private String regime = null;
	
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
	
	public void setCor(Color cor){
		this.cor = cor;
	}
	
	public Color getCor(){
		return cor;
	}
	
	public void setSistema(String sistema){
		this.sistema = sistema;
	}
	
	public String getSistema(){
		return sistema;
	}
	
	public void setRegime(Regime regime){
		this.regime = regime;
	}
	
	public Regime getRegime(){
		return regime;
	}
	
	public Planeta(String nomePlaneta, Color cor, String sistema, double diametro, Regime regime) {
		this.nomePlaneta = nomePlaneta;
		this.cor = cor;
		this.sistema = sistema;
		this.diametro = diametro;
		this.regime = regime;
	}
}
