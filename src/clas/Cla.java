package clas;

import personagens.*;

public class Cla {
	private String nomeCla = null;
	private Personagem instrutor = null;
	private int anoFundacao = 0;
	private int anoExtincao = 0;
	private String periodoFundacao = null;
	private String periodoExtincao = null;
	
	public Cla(String nomeCla, Personagem instrutor, int anoFundacao, int anoExtincao, String periodoFundacao, String periodoExtincao){
		this.nomeCla = nomeCla;
		this.instrutor = instrutor;
		this.anoFundacao = anoFundacao;
		this.anoExtincao = anoExtincao;
		this.periodoFundacao = periodoFundacao;
		this.periodoExtincao = periodoExtincao;
	}
	
	public void setNomeCla(String nomeCla){
		this.nomeCla = nomeCla;
	}
	
	public String getCla(){
		return nomeCla;
	}
	
	public void setInstrutor(Personagem instrutor){
		this.instrutor = instrutor;
	}
	
	public Personagem getInstrutor(){
		return instrutor;
	}
	
	public void setAnoFundacao(int anoFundacao){
		this.anoFundacao = anoFundacao;
	}
	
	public int getAnoFundacao(){
		return anoFundacao;
	}
	
	public void setAnoExtincao(int anoExtincao){
		this.anoExtincao = anoExtincao;
	}
	
	public int getAnoExtincao(){
		return anoExtincao;
	}
	
	public void setPeriodoFundacao(String periodoFundacao){
		this.periodoFundacao = periodoFundacao;
	}
	
	public String getPeriodoFundacao(){
		return periodoFundacao;
	}
	
	public void setPeriodoExtincao(String periodoExtincao){
		this.periodoExtincao = periodoExtincao;
	}
	
	public String getPeriodoExtincao(){
		return periodoExtincao;
	}

}
