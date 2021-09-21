package br.univas.edu;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String nome = leitura.nextLine();
		
		int[] strings = null;
		for (int i = 0; i < 50; i++) {
			System.out.println("Por favor, digite um nome:");
			strings[i] = leitura.nextInt();

		}

		for (int i = 0; i < 50; i++) {
			boolean nomeRepetido = false;
			
			for (int j = 0; j < 50; j++) {
				if (i != j && strings[i] == strings[j]) {
					nomeRepetido = true;
					break;
				}
			}
			
			if (nomeRepetido) {
				System.out.println(strings[i]);
			}
		}

		leitura.close();
	}
}