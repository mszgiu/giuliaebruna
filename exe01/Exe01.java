import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sacar;
		int valor;

		System.out.println("Digite o valor que deseja saca:");
		valor = scanner.nextInt();

		scanner.close();

		System.out.println("Notas:");
		System.out.println(valor / 100 + " nota(s) de 100 reais");
		valor %= 100;
		System.out.println(valor / 50 + " nota(s) de 50 reais");
		valor %= 50;
		System.out.println(valor / 20 + " nota(s) de 20 reais");
		valor %= 20;
		System.out.println(valor / 10 + " nota(s) de 10 reais");
		valor %= 10;
		System.out.println(valor / 5 + " nota(s) de 5 reais");
		System.out.println(valor / 2 + " nota(s) de 2 reais");
		valor %= 2;

	}

}
