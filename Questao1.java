package br.univas.edu;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[] notas = new int[25];
		int menor = 0;
		int maior = 0;
		
		for (int i = 0; i < 25; i++) {
			System.out.println("Por favor, digite as notas:");
			int nota = leitura.nextInt();
			notas[i] = nota;
			
			if (i == 0) {
				menor = nota;
				maior = nota;
			} else if (nota < menor) {
				menor = nota;
			} else if (nota > maior) {
				maior = nota;
			}
		}

		int soma = 0;
		int contador = 0;
		
		for (int i = 0; i < 25; i++) {
			if (notas[i] != menor && notas[i] != maior) {				
				soma += notas[i];
				contador++;
			}
		}
		
		
		leitura.close();
	}
}