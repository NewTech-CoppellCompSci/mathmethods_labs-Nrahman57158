package labs;

import java.util.Scanner;

public class Lab02 {

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
		//set variable needed to store input in statement

		System.out.println("Enter another positive interger");
		//print statement to ask user for a positive integer

		int posNum2 = inKey.nextInt();
		//set variable needed to store input in this  previous statement

		int count = 0;
		//keeps count of variables

		int min = Math.min(posNum, posNum2);
		//int to find minumum of the numbers

		int scope = Math.max(posNum2, posNum) - min + 1;
		//int to create a scope on number that the computer will then choose for the user

		while (count != 10) {
		//wet while loop and count is not 10

		int num = (int) (Math.random() * scope  + min);
		//random number genarator

		System.out.print(num + " ");
		//print statement to print users random number

		count++;
		//adds to count
		}
		System.out.println("");
		}
		

		public static void problem02() {
		
		System.out.println("\n");

			
		//v= Pi*R^2 * h
		
		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement

		System.out.println("Enter the radius");
		//print statement to ask user for a radius

		int radius = inKey.nextInt() ;
		//variable to store users input of radius

		System.out.println("Enter the height");
		//print statement to ask user for the height

		int height = inKey.nextInt();
		//variable to store users inputted height

		double radius2 = Math.pow(radius, 2) * Math.PI;
		//double for formula
		//radius^2 * PI

		double volume = radius2 * height;
		//double to find voulme needed for sultuion

		System.out.println("The cylinder's volume is " + volume);
		//print statement to print out volume of the cylinder
		}

		
		public static void problem03() {
		
		System.out.println("\n");
			
		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement

		System.out.println("Enter x1:");
		//print statement to ask user for one coordinate points first number
		
		double x1 = inKey.nextInt();
		//stores info on coordinate point ones first number

		System.out.println("Enter y1:");
		//print statement to ask user for one coordinate points second number

		double y1 = inKey.nextInt();
		//stores info on coordinate point ones second number

		System.out.println("Enter x2:");
		//print statement to ask user for another coordinate points first number

		double x2 = inKey.nextInt();
		//stores info on coordinate point twos first number

		System.out.println("Enter y2:");
		//print statement to ask user for another coordinate points second number

		double y2 = inKey.nextInt();
		//stores info on coordinate point twos second number

		double combineX = Math.pow(x2 - x1, 2);
		//double to combine both X's^2

		double combineY = Math.pow(y2 - y1, 2);
		//double to combine both Y's^2

		double almostThere = combineX + combineY;
		//double to combine previous combined ones

		double answer = Math.sqrt(almostThere);
		//double for solution

		System.out.println("Distance between points = " + answer);
		//print statement to print the distance between spaces to the user
		}

		public static void problem04() {
			
		System.out.println("\n");
		 
		Scanner inKey = new Scanner(System.in);
		// set scanner and started print statement

		System.out.println("Enter a-value:");
		//print statement to ask the user for the first value
		
		double a = inKey.nextInt();
		//variable to store users input on the first variable

		System.out.println("Enter b-value:");
		//print statement to ask the user for the second value
		
		double b = inKey.nextInt();
		//variable to store users input on the second variable


		System.out.println("Enter c-value:");
		//print statement to ask the user for the third value


		double c = inKey.nextInt();
		//variable to store users input on the third variable

		// x= -b plus or minus the sqrt of b^2 - 4AC / 2A
		
		double B2 = Math.pow(b,2); 
		//varibale double to copy b

		b = b * -1;
		//eqaution to make b negative

		double fourTimes = 4 * a;
		//double 4 times a

		double sqrt = B2 - fourTimes * c;
		//double to show step one of sqrt, b^2 - 4ac

		 sqrt = Math.sqrt(sqrt);
		//eqaution to find sqaure root of sqaure root

		 double plus = b + sqrt;
		//double opt 1

		double minus = b - sqrt;
		//double opt 2

		double plusDIVIDE = plus / (2 * a);
		//double dived

		double minusDIVIDE = minus / (2 * a);
		//double multiply

		System.out.println("x1 = " + plusDIVIDE);
		//print statments for user for bothe the opthions

		System.out.println("x2 = " + minusDIVIDE);
		//print statments for user for bothe the opthions

		}
		

	}

