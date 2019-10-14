package Actividades;

import java.util.*;

public class Ejercicio_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int base = 0;
		int espacios = 0;
		
		System.out.println("(Debe ser un numero impar)");	
		System.out.println("Introduce la base: ");
		base = sc.nextInt();
		espacios = base / 2;
		
		for (int i = 0; i < base; i+=2) {
			
			for (int o = 0; o < espacios; o++) {
				System.out.print(" ");
			}
			for (int o = 0; o < i; o++) {
				System.out.print("*");
			}
			espacios -= 1;
			System.out.println("*");
		}
		
		sc.close();
	}

}
