package ca.uwaterloo.cs446.designpatterns.strategy;

import java.util.Random;

public class RandomDiscount implements Discount {
	
    private Random random;
	
	public RandomDiscount() {
		random = new Random();
	}

	@Override
	public double compute(double fullPrice) {
		return fullPrice - fullPrice * random.nextDouble() * 0.5;
	}
}
