package session2.decision_making;
//Task 8: Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....
// (Hint : Learn concept on net and do it on your own)
public class Task8 {
    public static void main(String[] args) {
         int n = 50;
          int a=0;
          int b=1;
          int c=a+b;
          
          while(c<=n) {
          
             System.out.print(" "+c);
             c=a+b;
             a = b;
             b = c;
          }
    }
    }
