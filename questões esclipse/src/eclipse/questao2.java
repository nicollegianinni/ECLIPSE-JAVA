package eclipse;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		/*
		 menor  a  a  b  b  c  c 
		 meio   b  c  a  c  a  b
		 maior  c  b  c  a  b  a
		 
		 */

	}
	int a,b,c;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("nEntre com o valor de A:")
	a = leia.nextInt();
	System.out.println("nEntre com o valor de B:")
	b = leia.nextInt();
	System.out.println("nEntre com o valor de C:")
	c = leia.nextInt();
	
	
	if(a<=b && b<=c)
	{
		System.out.println("\n Ordem crescente: "+a+" , "+b+" ,"+c); //a,b,c
	}
	else if (a<=c && c<=b)
	{
		System.out.println("\n Ordem crescente: "+a+" , "+c+" ,"+b); //a,b,c
	}
	else if (a<=c && c<=b)
	{
		System.out.println("\n Ordem crescente: "+a+" , "+c+" ,"+b); //a,b,c
	}
}
