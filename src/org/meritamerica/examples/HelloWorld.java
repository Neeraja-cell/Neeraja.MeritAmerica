package org.meritamerica.examples;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Neeraja";
		//Primitive variable
		int x = 20;
		double  y = 20.0;
		boolean value = false;
		
		if(x > 20) {
			System.out.println("You exceeded the limit.The current value is " +x);
		
			//System.out.println("Hello World.I am "+ myName+"a learner at Merit America");
		}else
			System.out.println("The value is printed.The current value is " +x);
			
		int[] numbers = {1,2,4, 8, 23,32,3,18,6};
		
		//int max = numbers[0];
		int max = numbers[0];
		for (int j = 1; j < numbers.length; j++){
			if(numbers[j]> max )
			//	max = numbers[j];
			max = numbers[j];
		}
		System.out.println("The max value is " +max);
		
		int min= numbers[0];
		for (int j = 1; j < numbers.length; j++){
			if(numbers[j]< min )
			//	max = numbers[j];
			min = numbers[j];
		}
		System.out.println("The min value is " +min);
		
	}

}
