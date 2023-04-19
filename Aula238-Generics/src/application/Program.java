package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Generics: Permit that classes, interfaces and methods can be parameterized by a type.
		 * Benefits:
		 * -Reuse
		 * -Type safety
		 * -Performance
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of itens: ");
		int number = sc.nextInt();
		PrintList<String> lista = new PrintList<>();
		for(int i =0 ; i < number ; i++) {
			String item = sc.next();
			lista.add(item);
			
		}
		System.out.println("First: "+lista.first());
		lista.print();
		
		
	}

}
