package br.com.mensagem;

public class Mensagem {

	public static void getMenssagem(int hora) {
		
		switch(hora) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			mensagemBomDia();
			break;
			
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			mensagemBoaTarde();
			break;

		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
			mensagemBoaNoite();
			break;
			
		case 1:
		case 2:
		case 3:
		case 4:
			mensagemBoaMadrugada();
			break;
		
		}
	}


	private static void mensagemBoaMadrugada() {
		// TODO Auto-generated method stub
		System.out.println("Boa madrugada!");
	}


	private static void mensagemBomDia() {
		// TODO Auto-generated method stub
		System.out.println("Bom dia!");
	}
	
	private static void mensagemBoaTarde() {
		// TODO Auto-generated method stub
		System.out.println("Boa tarde!");
	}
	
	private static void mensagemBoaNoite() {
		// TODO Auto-generated method stub
		System.out.println("Boa noite!");
	}
	
}
