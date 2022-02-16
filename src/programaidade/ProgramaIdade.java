package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.print("Em que ano você nasceu ? ");
		int nasc = teclado.nextInt();
		int idade = 2015-nasc;
		System.out.println("Sua idade é : " + idade);
		if (idade>=18){
			System.out.println("VOCÊ É MAIOR DE IDADE ");}
		else {
		System.out.println("VOCÊ É MENOR DE IDADE. ");
		}
		
					
		}
		
		
				
	}


