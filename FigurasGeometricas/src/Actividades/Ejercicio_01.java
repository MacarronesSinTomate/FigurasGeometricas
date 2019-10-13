package Actividades;

import java.util.*;

public class Ejercicio_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alto = 0;
		
		System.out.println("Introduce el alto:");
		alto = sc.nextInt();
		
		for (int i = 0; i < alto; i++) {
			for (int o = 0; o < alto - 1; o++){
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		sc.close();
	}

}
