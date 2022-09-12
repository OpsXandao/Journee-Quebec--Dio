package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	System.out.println("Digite o primeiro valor: ");
	a = sc.nextInt();
	System.out.println("Digite o segundi valor: ");
	b = sc.nextInt();
	System.out.println();
	
	int soma = soma(a,b);
	int sub = subtracao(a,b);
	int divisao = divisao(a,b);
	int multi = multiplicacao(a,b);
	
	System.out.println(soma);
	System.out.println(sub);
	System.out.println(divisao);
	System.out.println(multi);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
}
