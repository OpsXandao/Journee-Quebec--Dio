package br.com.dio;

import java.util.*;

import br.com.dio.model.*;
import br.com.emprestimo.Emprestimo;
import br.com.mensagem.Mensagem;

/**
 * @author Alexandre
 *
 */
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*
		 
		 TESTE MENSAGEM DE BOAS-VINDAS!
		 
		System.out.println("INFORMAR HORA DO SISTEMA: ");
		
		Mensagem.getMenssagem(sc.nextInt());
		
		*/
		
		// Empréstimo
		
		int opcao=0;
        System.out.println("BEM-VINDO(A)!");
        
        do {System.out.println("1- Simulação Duas Parcelas" + "\n2- Simulação três Parcelas" + "\n3- Sair");
		System.out.println("Digite uma opção: ");
		opcao = sc.nextInt();
		switch (opcao) {
		case 1: System.out.println("Digite o valor desejado: "); Emprestimo.calcular(sc.nextInt(), Emprestimo.getDuasParcelas());
		break;
		case 2: System.out.println("Digite o valor desejado: "); Emprestimo.calcular(sc.nextInt(), Emprestimo.getTresParcelas());
		break;
		}
        }
		while(opcao!=3);
		
		System.out.println("Fim do programa"+ "\n");

		}
}

