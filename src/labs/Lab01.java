package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		

		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement

		System.out.println("Enter a positive interger");
		//print statement to ask user for a number

		int posNum = inKey.nextInt();
		//set variable needed for statement

		System.out.println("Enter a positive interger");
		//print statement to ask user for another number

		int posNum2 = inKey.nextInt();
		//set next 

		double pos3 = Math.pow(posNum, posNum2);
		// findes users int 1to the power of users int 2 

		System.out.println(posNum + "^" + posNum2 + " = " + pos3);
		//prints solution for user

		}
		

		public static void problem02() {
		
		System.out.println("\n");

		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement

		System.out.println("Enter a positive interger");
		//print statement to ask user for a positive integer

		int posNum = inKey.nextInt();
		//set variable needed for statement
		
		double posSQRT = Math.sqrt(posNum);
		//set double needed for statement
		
		System.out.println("The square root of " +posNum + " is " + posSQRT);
		//prints results
		}

		public static void problem03() {
	
		System.out.println("\n");

		// A^2 + B^2 = C^2
		
		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement
		
		System.out.println("Enter length of side A");
		//print statement asking for side a
		
		int sideA = inKey.nextInt();
		//sore input of side a
		
		System.out.println("Enter length of side B");
		//print statement asking for side b

		int sideB = inKey.nextInt();
		//sore input of side b

		double APowerOf = Math.pow(sideA, 2);
		//set double to find side a to the power of 2
		
		double BPowerOf = Math.pow(sideB,2);
		//set double to find side b to the power of 2

		double hypothoPowerOf = APowerOf + BPowerOf;
		//double that adds both results to find C^2

		double hypotho = Math.sqrt(hypothoPowerOf);
		//double that finds the square root of the result and finds the real hypotenuse

		System.out.println("Hypotenuse = " + hypotho);
		//hypthenuse found
		}



		public static void problem04() {
			
		System.out.println("\n");

		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement
		
		int max = Integer.MIN_VALUE;
		//variable to find max value
		
		int min = Integer.MAX_VALUE;
		//variable to find min value

		System.out.println("Enter an interger");
		//print statement to ask user for an integer

		int input = inKey.nextInt();
		//created variable to stores users input

		while (input != 0){
		//started while loop

		max = Math.max(max, input);
		//compares input to max 
		//stores biggest
		
		min = Math.min(min, input);
		//compares input to min
		//stores smallest

		System.out.println("Enter an interger");
		//print statement to ask user for another integer

		 input = inKey.nextInt();
		//variable that stores input
		 
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		//print statements to print results min and max
		}
		

	}
