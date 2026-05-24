package main;

import java.util.Scanner;

public class NumeroPrimo {
	
		public static  void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite um número: ");
			int numero1 = scanner.nextInt();
			
			boolean ePrimo = true;
			
			for (int i = 2; i <= numero1 -1; i++) {
				if (numero1 % i == 0) {
					ePrimo = false;
					break;
				}
			}
			
			if (ePrimo == true) {
				System.out.print("É um número primo");
			} else {
				System.out.print("Não é primo");
			}
			
			scanner.close();
		}
	
}
