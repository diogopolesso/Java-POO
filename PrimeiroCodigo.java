package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		String nome = "Diogo";
		idade = idade +2;
		double peso = 72.5;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite idade, peso e nome");
		idade = teclado.nextInt();
		peso = teclado.nextFloat();
		nome = teclado.next();
		
		System.out.println();
		
		System.out.println("Nome: " + nome);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Peso: %.2f\n", peso);
		
		if(idade <18) {
			System.out.println("Acesso Bloqueado!");
			System.out.println("Acesso Bloqueado!");
		}
		else if(idade <65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}

	}

}
