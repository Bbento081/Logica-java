package com.bruno.cursojava.exercicios.aula19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] a = new int[5];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Entre com o valor da posição : " + i);
			a[i] = scan.nextInt();
			
			b[i] = a[i];
		}
		
		System.out.println("Vetor a = ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
		System.out.println();
		
		System.out.println("Vetor b = ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(b[i] + "");
		}
		
		
		
	}

}
