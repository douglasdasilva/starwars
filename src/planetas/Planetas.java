package planetas;

import configuracoes.Cores;
import regimes.Regimes;

public class Planetas {
	public static Planeta coruscant = new Planeta("Coruscant", Cores.metalico, "Coruscant", 12240, Regimes.republicaGalatica);
	public static Planeta shili = new Planeta("Shili", Cores.azul, "Shili", 23456, Regimes.republicaGalatica);
	public static Planeta geonosis = new Planeta("Geonosis", Cores.vermelho, "Geonosis", 111222, Regimes.confederacaoDeSistemasIndependentes);
	public static Planeta serenno = new Planeta("Serenno", Cores.preto, "Serenno", 22222, Regimes.confederacaoDeSistemasIndependentes);
	public static Planeta korriban = new Planeta("Korriban", Cores.vermelho, "Horuset", 18984, Regimes.confederacaoDeSistemasIndependentes);
	public static Planeta naboo = new Planeta("Naboo", Cores.cinza, "Naboo", 32321, Regimes.imperioGalatico);
	public static Planeta tatooine = new Planeta("Tatooine", Cores.marrom, "Tatoo", 9876, Regimes.imperioGalatico);
	public static Planeta jakku = new Planeta("Jakku", Cores.cinza, "Jakku", 6400, Regimes.imperioGalatico);
	public static Planeta cevery = new Planeta("Cevery", null, "Cevery", -1, null);
	public static Planeta stewjon = new Planeta("Stewjon", null, "Stewjon", -1, null);
	public static Planeta byss = new Planeta("Byss", Cores.cinza, "Byss", -1, null);
}
