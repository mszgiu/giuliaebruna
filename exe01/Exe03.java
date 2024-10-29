import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;

		System.out.println("Informe um numero: ");
		num = scanner.nextInt();

		int soma = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}
       
		System.out.println("As somas dos numeros pares ente 1 e " + num + " é: " + soma);

	}

}
