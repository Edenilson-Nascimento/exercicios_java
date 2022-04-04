package br.com.generation.atividades;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		int numb1, numb2, numb3, maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numb1 = leia.nextInt();
		System.out.println("Digite o segundo inteiro: ");
		numb2 = leia.nextInt();
		System.out.println("Digite o terceiro inteiro: ");
		numb3 = leia.nextInt();
		
		if(numb1 > numb2 && numb1 > numb3) {
			maior = numb1;
		}else if(numb2 > numb1 && numb2 > numb3) {
			maior = numb2;
		}else {
			maior = numb3;
		}
		System.out.println("O maior número é " + maior);
		leia.close();

	}

}
