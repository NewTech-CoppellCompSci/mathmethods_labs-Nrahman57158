package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
        //set scanner and started print statement

		 System.out.println("Enter launch velocity (m/s)");
		//print statement to ask user for the launch velocity

		 double velo = inKey.nextLong();
		 //double to store users inputted variable

		 System.out.println("Enter launch angle (degrees)");
		 //print statement to ask user for launch angle of t shirt

		 double  launch = inKey.nextLong();
		 //double to store users inputted launch angle

		 launch =  Math.toRadians(launch);
		 //converts the inputted launch to radians for the .cos and .sin
		 //xPosition = cosine of launch angle * time * launchVelocity;
		 
		 double time = 0;
		 //double to keep track of time in seconds

		 double xpos = Math.sin(launch) * time * velo ;
		 //double varibale that converts launch to sin, * time * velocity input
		 //yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time2
		 
		 double ypos = Math.sin(launch) * time * velo - 0.5 * 9.8 * time;
		 //double varibale that covnverts y launch to sin * time * velocity -0.5 * 9.8 * time 
		 //x = Vx * t => t = x / Vx
		 
		 while (ypos >= 0) {
	     //start of while loop
		 //y pos is greater than or equal to 	0 

		 System.out.println("Time: " + time +" s");
		 //print statement to print out time and current x and y positions
		 System.out.println("     x-pos: " + xpos + "m");
		 //print statement to print out time and current x and y positions
		 System.out.println("     y-pos: " + ypos + "m");
		 //print statement to print out time and current x and y positions
		 
		 time++;
		 //statement to increment time
		 
		  xpos = Math.cos(launch) * time * velo ;
		  //reevaluates the x an y positions with formula
		  ypos = Math.sin(launch) * time * velo - 0.5 * 9.8 * Math.pow(time, 2);
		  //reevaluates the x an y positions with formula

		 //this will repeat until the t-shirt is on the ground 
		 }
		 
		 System.out.println("Time: " + time +" s");
		 //print statement to print out current time and final position of t-shirt on x positions 
		 System.out.println("     x-pos: " + xpos + "m");
		 //print statement to print out current time and final position of t-shirt on x positions 
		 System.out.println("     y-pos: 0m");
		 //print statement to print out current time and final position of t-shirt on x positions 

		 
		}
		
	}
