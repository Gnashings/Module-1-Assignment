//Author Name: Nash Roy
//Date: 01/13/2019
//Program Name: Nash_Airplane
//Purpose: Simulation using "call" button, call attendant

package module1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Roy_Nash {

	//simple class to turn the lights on for each seat
	public static boolean turnSeatLightOn(boolean[] seatlight, int n){
		if (seatlight[n-1]==true)
		{	//to check if lights are on
			System.out.println("the seat light is already on.");
			return seatlight[n-1] = true;
		}
		System.out.println("Seat number " + (n) + " light turned on");
		return seatlight[n-1] = true;
	}
	
	public static void main(String[] args) {
    	
	    int n;
	    boolean[] seat = new boolean[5];
	    Arrays.fill(seat, Boolean.FALSE);
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter 1 to turn on a light as a passenger.");
	    System.out.println("Enter 2 to turn of a light as an attendant.");
	    System.out.print("Enter 0 to exit the program: ");
	   
	    while ((n = input.nextInt()) != 0) {
	      System.out.println("You entered " + n);
	      if (n == 1)
	      {  //code to change individual seat lights (1-5)
    		  System.out.print("Enter the seat number(1 - 5) one at a time to turn on the light. Or 0 to return: ");
	    	  while((n = input.nextInt()) != 0){
	    		  if (n == 1 || n == 2 || n == 3 ||  n == 4 ||  n == 5 )
	    		  {	    		  
		    		  turnSeatLightOn(seat, n);
		    		  break;  
	    		  }
	    		  else
	    		  {
	    		  	  System.out.println("Please enter a valid number.");
	    		  	  continue;
	    		  }
	    	  }
		  	  System.out.println("Enter 1 to turn on a light as a passenger.");
			  System.out.println("Enter 2 to turn of a light as an attendant.");
			  System.out.print("Enter 0 to exit the program: ");
	    	  continue;
	      }
	      if (n == 2)
	      {	  //just falsifies all the seats of the lights are on
	    	  Arrays.fill(seat, false);
		  	  System.out.println("All seat lights turned off.");
	      }
	      else
	      {	  //ensures people enter a valid numbers
		  	  System.out.println("Please enter a valid number.");
		  	  continue;
	      }
	    }
	    //dumps all the current states of the lights
	    System.out.println("Out of loop");
	    for (boolean value : seat) {
	          System.out.println("light on = " + value);
	    }
	}

}
