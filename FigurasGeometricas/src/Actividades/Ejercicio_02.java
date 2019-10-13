package Actividades;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alto = 0;
		
		System.out.println("Introduce el alto:");
		alto = sc.nextInt();
		
		for (int i = 0; i < alto; i++) {
			if(i == 0 || i == alto - 1) {
				for (int o = 0; o < alto - 1; o++){
					System.out.print("*");
				}
			}else {
				System.out.print("*");
				for (int o = 0; o <= alto - 3; o++){
					System.out.print(" ");
				}	
			}
			System.out.println("*");
		}
		
		sc.close();
	}

}
