package br.com.generation.atividades;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Sua categoria � infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua catgoria � juvenil");
		}
		else if(idade >=18 && idade <= 25) {
			System.out.println("Sua cadegoria � a de adultos");
		}
		else {
			System.out.println("Sua categoria n�o foi registrada");
		}
		leia.close();


	}

}
