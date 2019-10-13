package Actividades;

import java.util.*;

public class Ejercicio_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base = 0;
		
		System.out.println("Introduce la base: ");
		base = sc.nextInt();
		
		System.out.println("*");
		
		for (int i = 0; i < base - 1; i++) {
			for (int o = 0;o <= i; o++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		sc.close();
	}
	
}
