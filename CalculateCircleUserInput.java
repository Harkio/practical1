//Code for calculating the circumference of a circle where the user defines the area
//Author Graham Harkness 05834503

import java.util.Scanner;
   public class CalculateCircleUserInput{ 
    public static void main(String[] args) {
	
		//This requests the user to input the radius
		System.out.println("Please input the circle's radius:");
    	Scanner input = new Scanner(System.in);
			
			//Defines Variables
			double radius = input.nextInt();
			double pi=3.14159;
			double area=radius*radius*pi;
			double diameter = radius + radius;
		
		
				//Prints results to screen
				System.out.println("You have defined the circle's radius as " + radius );
				System.out.println("It's area is " + area);
				System.out.println("It's circumference is " + pi*diameter); 	
		 }
		}
		
		
		
		
		
		
		