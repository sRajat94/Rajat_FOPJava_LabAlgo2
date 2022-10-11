package com.greatLearning.javaFSD.Traveler;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String args[]) {
		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
			}
		System.out.println("Enter the amount you want to pay ");
		int amount = sc.nextInt();
		DenominationCalculator dc = new DenominationCalculator(array, amount);
		dc.calculate();
		
		sc.close();
		}

}
