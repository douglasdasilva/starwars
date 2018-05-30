package batalha;

import personagens.*;

public class Batalha {
	public void batalha(Personagem lutador1, Personagem lutador2) {
		do {
			ataque(lutador1, lutador2);
			ataque(lutador2, lutador1);
		} while(lutador1.estaVivo() && lutador2.estaVivo());
		
		if(lutador1.estaVivo()) {
			System.out.println(lutador1.getNomePersonagem() + "venceu!\n");
		} else if(lutador2.estaVivo()) {
			System.out.println(lutador2.getNomePersonagem() + "venceu!\n");
		} else {
			System.out.println("A luta terminou empatada!\n");
		}
	}
	
	public void ataque(Personagem atacante, Personagem defensor) {
		int dano = 0;
		int novaQtdeVida = defensor.getQtdeVida() - dano;
		defensor.setQtdeVida(novaQtdeVida);
		
		System.out.println("O ataque de " + atacante.getNomePersonagem() + " causou um dano de " + novaQtdeVida + " em " + defensor.getNomePersonagem() + "!\n");
		System.out.println(defensor.getNomePersonagem() + " agora tem " + defensor.getQtdeVida() + " de quantidade de vida!\n");		
	}
}
