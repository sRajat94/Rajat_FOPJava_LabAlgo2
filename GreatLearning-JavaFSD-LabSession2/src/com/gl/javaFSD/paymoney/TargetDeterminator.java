package com.gl.javaFSD.paymoney;

import java.util.Arrays;

public class TargetDeterminator {
	private int[] transactions;
	private int dailyTarget;
	private boolean outcome =false;
	public TargetDeterminator(int[] transactions, int dailyTarget) {
		this.transactions = transactions;
		this.dailyTarget = dailyTarget;
	}
	void determine() {
		int tempSum =0;
		int counter = 0;
		for(int index =0;index < transactions.length; index ++) {
			int transactionValue = transactions[index];
			tempSum = tempSum +transactionValue;
			if(tempSum >=dailyTarget) {
				outcome = true;
				counter = index+1;
				break;
			}
		}
		
		Arrays.toString(transactions);
		if(outcome) {
			System.out.println();
			System.out.println("Daily target of "+dailyTarget+ " is achieved after " +counter+" transactions ");
		}else {
			System.out.println("Daily target can't be achieved");
		}
		//for loop
		//transactionValue
		
		//tempValue = transactionValue
		
		//if(tempValue >=dailyTarget)
		//sop(achieved)
	}

}
