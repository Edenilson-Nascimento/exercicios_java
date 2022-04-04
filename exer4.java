package br.com.generation.atividades;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
	      int numb;
	        double raiz2, raiz3, elevado;
	        
	        Scanner leia = new Scanner(System.in);

	        System.out.println("Digite um numero inteiro ");
	        numb = leia.nextInt();

	        if(numb % 2 == 0) {
	            System.out.println("Este número é Par!.");
	            
	            raiz2 = Math.sqrt(numb);//Biblioteca para Raiz quadrada
	            raiz3 = Math.cbrt(numb);//Raiz cúbica

	            System.out.println("Raiz Quadrada é: " +raiz2);
	            System.out.println("Raiz Cúbica é: " +raiz3);
	        }
	        else if(numb % 2 == 1) {
	            System.out.println("Este número é ímpar!");
	            elevado = (numb*numb);
	            System.out.println("E sua p6otência é: " + elevado);
	        }
	        leia.close();

	}

}
