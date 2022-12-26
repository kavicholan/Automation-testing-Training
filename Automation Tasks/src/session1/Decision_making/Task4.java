package session1.Decision_making;
//Write a program to calculate the sum offirst 10 natural number. [Try the program in for,while and dowhile]
public class Task4 {
    public static void main(String[] args) {
        int j=1;
        int k=1;
        for(int i =1;i<=10;i++){
            System.out.println("for loop "+i);
        }

        while(j<=10){
            System.out.println("while loop "+j);
            j++;
        }

        do{
            System.out.println("do while loop "+k);
            k++;
        }while(k<=10);

    }
}

