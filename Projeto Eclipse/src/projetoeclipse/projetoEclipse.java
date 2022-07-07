package projetoeclipse;

import java.util.Scanner;

public class projetoEclipse {

	public static void main(String[] args) {

		double n1, n2, n3, media;
		int op;

		Scanner leia = new Scanner(System.in);
		System.out.println("\n Entre com a primeiro nota: ");
		n1 = leia.nextFloat();
		System.out.println("\n Entre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\n Entre com a terceira nota: ");
		n3 = leia.nextFloat();

		media = (n1 + n2 + n3) / 3;
		System.out.println("\n media:"+media);
		System.out.printf("\nMedia %2.2f",media);

		if (media >= 7 && media <= 10) {
			System.out.println("\n Aluno aprovado!!! ");
		}

		else if (media >= 5 && media < 7) {
			System.out.println("\n Aluno precisa realizar a prova de recuperação!!!");

		} else {
			System.out.println("\n aluno reprovado!!!");
		}
		System.out.println("\n\t\t O Java é");
		System.out.println("\n 1- maquina virtual(JVM)");
		System.out.println("\n 2- biclioteca API");
		System.out.println("\n 3-linguagem Java");
		op = leia.nextInt();

		switch (op) {
		case 1:
			System.out.println("\n\t\t maquina virtual(JVM)");
			break;
		}

		switch (op) {
		case 2:
			System.out.println("\n\t\t biclioteca API");
			break;
		}

		switch (op) {
		case 1:
			System.out.println("\n\t\t linguagem Java");
			break;

		default:
			System.out.println("opção invalida.");
		}

		n1 = Math.sqrt(n2);
		n2 = Math.pow(n1, 3);

	}

}
