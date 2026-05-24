package main;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Digite o operador: ");
		String operador = scanner.next();
		
		System.out.print("Digite um número: ");
		double numero2 = scanner.nextDouble();
		
		if (operador.equals("/") && numero2 == 0) {
			System.out.print("Não pode haver divisão por 0");
			scanner.close();
			return;
		}
		
		double resultado = 0;
		
		/*
		
		if (operador.equals("+")) {
			resultado = numero1 + numero2;
		} else if (operador.equals("-")){
			resultado = numero1 - numero2;
		} else if (operador.equals("*")) {
			resultado = numero1 * numero2;
		} else if (operador.equals("/")) {
			resultado = numero1 / numero2;
		} else {
			System.out.print("Operador inválido");
		}
		
		*/
		
		switch(operador) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		default:
			System.out.print("Operador inválido");
			scanner.close();
			return;
		}
		
		System.out.print(numero1 + operador + numero2 + " = " + resultado);
			
		scanner.close();
	}

}
