package Actividades;

import java.util.*;

public class Ejercicio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int altura = 0;
		int base = 0;
		
		System.out.println("Introduce el alto:");
		altura = sc.nextInt();
		System.out.println("Introduce el ancho:");
		base = sc.nextInt();
		
		for (int i = 0; i < altura; i++) {
			if(i == 0 || i == altura - 1) {
				for (int o = 0; o < base - 1; o++){
					System.out.print("*");
				}
			}else {
				System.out.print("*");
				for (int o = 0; o <= base - 3; o++){
					System.out.print(" ");
				}	
			}
			System.out.println("*");
		}
		
		sc.close();
	}
	
}
