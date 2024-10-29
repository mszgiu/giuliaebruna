package giuliaebruna;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		boolean acerto = false;

		for (int i = 1; i <= 7; i++) {
			System.out.print("\nDigite um numero de 1 a 100:");
			num = scanner.nextInt();

			if (num < 8) {
				System.out.print("Essa foi a sua " + i + " tentativa");
				System.out.print("\nVocê errou! o numero digitado é menor do que o numumero escolhido.");
			} else if (num > 8) {
				System.out.print("Essa foi a sua " + i + " tentativa");
				System.out.print("\nVocê errou! o numero digitado é maior que o num escolhido.");
			} else {
				acerto = true;
			}
		}
		if (acerto) {
			System.out.print("Você acertou!! o numero escolhido era 8.");
		} else {
			System.out.print("\nAcabou suas sete tentativas, você não acertou o numero escolhido");
		}
	}

}
