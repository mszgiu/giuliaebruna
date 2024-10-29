

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		int soma;

		System.out.println("Informe um numero: ");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			soma = (num * (num + 1)) / 2;
			System.out.println("A soma dos numeros inteiro de 1 a " + num + " é: " + soma);
		}

		else {
			System.out.println("o numero informado não é par.");
		}

		scanner.close();
	}

}
