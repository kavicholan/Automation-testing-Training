package session2.decision_making;
//Task 6: Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
//For example, if the input is 12345, the output should be 54321.
// (Hint : Learn concept on net and do it on your own)
public class Task6 {
    public static void main(String[] args) {

    	 int number = 12345, reversed = 0;

    	 while(number != 0) {
    		    
    	      int digit = number % 10;
    	      reversed = reversed * 10 + digit; //bodmas rule
    	      number /= 10;
    	    }


    	    System.out.println("Reversed Number: " + reversed);
    	  }
    	}