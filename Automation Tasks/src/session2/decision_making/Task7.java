package session2.decision_making;
//Task 7:Write a program that prompts the user to input a positive integer.
// It should then output a message indicating whether the number is a prime number. (Hint : Learn concept on net and do it on your own)

import java.util.Scanner;

public class Task7 {
	

    public static void main(String[] args) {
    	 int n;
    	 int count =0;
    	 
    	 Scanner sc = new Scanner (System.in);
    	 n =sc.nextInt();
    	 
    	 for(int i=1;i<n;i++) {
    		 if(n%i==0) {
    			 count++;
    		 }
    	 }
    	 if (count==2) {
    		 System.out.println(n+"is prime number");
    	 }else {
    		 System.out.println(n+"is not a prime number");

    	 }    	
    }
    }
