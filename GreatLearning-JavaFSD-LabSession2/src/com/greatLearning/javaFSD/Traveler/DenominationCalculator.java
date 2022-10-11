package com.greatLearning.javaFSD.Traveler;

public class DenominationCalculator {
	private int[] denominations;
	private int paymentAmount;
	
	private boolean outcome;
	
	public DenominationCalculator(int[] denominations, int paymentAmount) {
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;
		 this.outcome = false;
		
	}
	public void calculate() {
		
		Sort sort = new Sort(denominations);
		sort.sortDesc();
		
		//sort the denominations of the array
		
//		StringBuilder result = new StringBuilder();
		int tempAmount = paymentAmount;
		for(int index = 0; index < denominations.length;index++) {
			
			int denominationValue = denominations[index];
			int quotient = tempAmount / denominationValue;
			int remainder = tempAmount % denominationValue;
			
			
			if(quotient != 0) {
				
//				result.append(String.format("Denomination Value %d, Denomination Count %d", denominationValue, quotient));
				System.out.println("Your payment approach in order to give min no of notes will be");
				System.out.println(denominationValue+":"+quotient);
				tempAmount = remainder;

			}
			if(remainder == 0) {
				this.outcome = true;
				break;
			}
			
			
		}
		if(outcome) {
			System.out.println("Success");
			
		}else {
			System.out.println("Failure");
		}
		
	}

}
