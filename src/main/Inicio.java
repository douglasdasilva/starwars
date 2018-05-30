package main;

import personagens.*;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Personagem mestreJedi = null;
		Personagem lordeSith = null;
		
		System.out.println("STAR WARS - Batalha entre Mestre Jedi e Lorde Sith\n\n");
		System.out.println("Escolha um entre os Mestres Jedi:\n");
		System.out.println("(1) Mestre Yoda\n");
		System.out.println("(2) Obi-Wan Kenobi\n");
		System.out.println("(3) Ahsoka Tano\n\n");
		
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		if(n == 1) mestreJedi = Personagens.yoda;
		if(n == 2) mestreJedi = Personagens.obiWanKenobi;
		if(n == 3) mestreJedi = Personagens.ahsokaTano;
		
		System.out.println("Mestre Jedi escolhido: " + mestreJedi.getNomePersonagem() + "\n\n");
		
		System.out.println("Escolha um entre os Lordes Sith:\n");
		System.out.println("(1) Darth Tyranus\n");
		System.out.println("(2) Darth Sidious\n");
		System.out.println("(3) Darth Vader\n\n");
		
		int m = ler.nextInt();
		if(m == 1) lordeSith = Personagens.darthTyranus;
		if(m == 2) lordeSith = Personagens.darthSidious;
		if(m == 3) lordeSith = Personagens.darthVader;
		
		System.out.println("Lorde Sith escolhido: " + lordeSith.getNomePersonagem() + "\n\n");
		
		ler.close();
		
	}

}
