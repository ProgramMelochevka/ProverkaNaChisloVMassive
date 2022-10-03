package by.home.maxzzzit;

import java.util.Scanner;

public class ProverkaNaChisloVMassive {
	static int chislo;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[]args) {
		vvodChisla();
	}
	
	static void vvodChisla() {
		int n = 0, i = 0;
		System.out.println("Введите размер массива: ");
		try {n = scn.nextInt();
		int [] array = new int[n];
		System.out.print("Введите число : ");
		chislo = scn.nextInt();
		for (; i <= array.length-1; i++) {
			System.out.println("Вы ввели число - "+(chislo+i));
		}
			System.out.println(i);
		
		} catch (Exception e) {
			System.out.println("Вы ввели не число!");
			System.exit(0);
		}
	}
}
