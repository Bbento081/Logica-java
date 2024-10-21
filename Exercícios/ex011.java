package com.bruno.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {

		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Olá, funcionário da rede Tabajara, devido a reajustes da nossa rede");
			System.out.println("Informe o seu salário atual aqui na rede");
			
			double salario = scan.nextDouble();
			calcularReajustes(salario);	
		}
	}
	
	public static void calcularReajustes(double salario) {
		double aumento;
		String percentual;
		
		if(salario >= 0 && salario <= 280) {
			percentual = "20%";
			aumento = salario * 0.20;
			
		}else if(salario <= 700) {
			percentual = "15%";
			aumento = salario * 0.15;
			
		}else if(salario <= 1500) {
			percentual = "10%";
			aumento = salario * 0.10;
			
		}else {
			percentual = "5%";
			aumento = salario * 0.05;
		}
		
		System.out.println("O seu salário antes do reajuste era de: " + salario + " R$");
        System.out.println("O percentual de aumento foi de: " + percentual);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("O seu salário atual é de: " + (salario + aumento));
	}

}
