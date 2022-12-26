package session1.Decision_making;
//Task 2: Write Java program that accepts threenumber from the user and print the greatest number.
public class Task2 {
    public static void main(String[] args) {
        long a=1012212122L;
        long b=9212112219L;
        long c=1212112210L;
        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else if (c>=a && c>=b)
            System.out.println(c+" is the largest number");
    }

}