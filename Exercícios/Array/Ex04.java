package com.bruno.cursojava.exercicios.aula19;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try{
			int[] vetorA = new int[15];
			int[] vetorB = new int[vetorA.length];
			
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("Insira a posição " + i);
				vetorA[i] = scan.nextInt();
				vetorB[i] = vetorA[i] * vetorA[i];
				
			}
			System.out.println("Vetor a = ");
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);
			}
			System.out.println();
			
			System.out.println("Vetor b = ");
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorB[i]);
			}
		}catch(Exception e) {
			String message = e.getMessage();
			System.out.println("Erro : " + message);
		}finally {
			scan.close();
		}
		
	}

}
