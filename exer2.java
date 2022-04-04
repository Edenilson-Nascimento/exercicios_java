package br.com.generation.atividades;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		int numb1, numb2, numb3;
      
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numb1 = leia.nextInt();
		System.out.println("Digite o segundo inteiro: ");
		numb2 = leia.nextInt();
		System.out.println("Digite o terceiro inteiro: ");
		numb3 = leia.nextInt();
		
		
		if(numb1 <= numb2 && numb1 <= numb3 && numb2 <= numb3) {
			System.out.println(numb1 + ", " + numb2 + ", " + numb3);
		}
		else if(numb1 <= numb2 && numb1 <= numb3 && numb3 <= numb2) {
			System.out.println(numb1 + ", " + numb3 + ", " + numb2);
		}
		else if(numb2 <= numb1 && numb2 <= numb3 && numb1 < numb3) {
			System.out.println(numb2 + ", " + numb1 + ", " + numb3);
		}
		else if(numb2 <= numb1 && numb2 <= numb3 && numb3 < numb1) {
			System.out.println(numb2 + ", " + numb3 + ", " + numb1);
		}
		else if(numb3 <= numb1 && numb3 <= numb2 && numb1 < numb2) {
			System.out.println(numb3 + ", " + numb1 + ", " + numb2);
		}
		else if(numb3 <= numb1 && numb3 <= numb2 && numb2 < numb1) {
			System.out.println(numb3 + ", " + numb2 + ", " + numb1);
		}
		
		
		leia.close();

	}

}
