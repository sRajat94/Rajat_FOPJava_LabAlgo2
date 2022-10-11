package com.gl.javaFSD.paymoney;

import java.util.Scanner;

public class InputArray {
	public static void main(String args[]) {
		System.out.println("Enter the size of transaction Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the values of the array");
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
			}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int target = sc.nextInt();	
		TargetDeterminator td = new TargetDeterminator(array, target);
		td.determine();
		sc.close();
		}


}
