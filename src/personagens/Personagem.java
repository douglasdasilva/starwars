package personagens;
import planetas.Planeta;

public class Personagem {
	private String nomePersonagem = null;
	private String genero = null;
	private String especie = null;
	private int anoNascimento = 0;
	private String periodoNascimento = null;
	private Planeta planetaNascimento;
	private boolean imortalidade = false;
	private double campoVidencia = 0;
	private int qtdeVida = 0;
	private int dominioForca = 0;
	private int dominioSabre = 0;
	private Personagem[] habilidades = null;
	private float midichlorians = 0;
	
	public Personagem(String nomePersonagem, String genero, String especie, int anoNascimento, String periodoNascimento, Planeta planetaNascimento, boolean imortalidade, double campoVidencia, int qtdeVida, int dominioForca, int dominioSabre, Personagem[] habilidades, float midichlorians) {
		this.nomePersonagem = nomePersonagem;
		this.genero = genero;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
		this.periodoNascimento = periodoNascimento;
		this.planetaNascimento = planetaNascimento;
		this.imortalidade = imortalidade;
		this.campoVidencia = campoVidencia;
		this.qtdeVida = qtdeVida;
		this.dominioForca = dominioForca;
		this.dominioSabre = dominioSabre;
		this.habilidades = habilidades;
		this.midichlorians = midichlorians;
	}
	
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getPeriodoNascimento() {
		return periodoNascimento;
	}
	public void setPeriodoNascimento(String periodoNascimento) {
		this.periodoNascimento = periodoNascimento;
	}
	public Planeta getPlanetaNascimento() {
		return planetaNascimento;
	}
	public void setPlanetaNascimento(Planeta planetaNascimento) {
		this.planetaNascimento = planetaNascimento;
	}
	public boolean isImortalidade() {
		return imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		this.imortalidade = imortalidade;
	}
	public double getCampoVidencia() {
		return campoVidencia;
	}
	public void setCampoVidencia(double campoVidencia) {
		this.campoVidencia = campoVidencia;
	}
	public int getQtdeVida() {
		return qtdeVida;
	}
	public void setQtdeVida(int qtdeVida) {
		this.qtdeVida = qtdeVida;
	}
	public int getDominioForca() {
		return dominioForca;
	}
	public void setDominioForca(int dominioForca) {
		this.dominioForca = dominioForca;
	}
	public int getDominioSabre() {
		return dominioSabre;
	}
	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	public Personagem[] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Personagem[] habilidades) {
		this.habilidades = habilidades;
	}
	public float getMidichlorians() {
		return midichlorians;
	}
	public void setMidichlorians(float midichlorians) {
		this.midichlorians = midichlorians;
	}	
}
