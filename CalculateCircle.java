//Calcualte the area of a circle.
//Author Graham Harkness 05834503

	public class CalculateCircle{
      public static void main(String[] args) {
		
		//Defines Variables
		int radius;
		double area;
		double pi;
		double diameter;
	  
			  //Assigns the Radius
			  radius=5;
			  
			  //Assigns Pie
			  pi=3.14159;
			  
			  //Calculates the Area
			  area=radius*radius*3.14159;
			  
			  //Calculates the Diameter
			  diameter=radius+radius;
		  
				  //Prints Results to Screen
				  System.out.println("The circle has a radius of " + radius);
				  System.out.println("It's area is "  + area);
				  System.out.println("It's circumference is " + pi*diameter);
		   }
	  }