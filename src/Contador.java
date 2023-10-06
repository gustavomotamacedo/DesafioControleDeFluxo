import java.util.Scanner;

public class Contador {
	public static Scanner sc = new Scanner(System.in);
	public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
		if (parametro1 < parametro2) {
			int iteracoes = 1;
			for (int i = parametro1; i <= parametro2; i++) {
				System.out.println("Imprimindo o número " + iteracoes);
				++iteracoes;
			}
		} else {
			throw new ParametrosInvalidosException();
		}
	}
	public static void main(String[] args) {
		System.out.println("Contador\nDigite dois números inteiros e eu irei contar de primeiro até o segundo.");
		System.out.print("Número 1: ");
		int numero1 = sc.nextInt();
		System.out.print("Número 2: ");
		int numero2 = sc.nextInt();
		try {
			contar(numero1, numero2);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O primeiro numero deve ser menor que o segundo!");
		}
		sc.close();
	}
}
