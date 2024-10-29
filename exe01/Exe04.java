package giuliaebruna;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;

		System.out.print("Digite um numero(Ímpar):");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.print("O numero digitado é par.");

		} else {
			for (int i = 1; i <= num; i++) {

				int mult = num * i;
				System.out.println(num + " x " + i + " = " + mult);
			}

		}
	}
}