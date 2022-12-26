package session1.Datatype;
//Task 5: Write a Javaprogram to declare a String variable with initial value of “5”and convert it to “int” before printing it
public class Task5 {
    public static void main(String[] args) {

        String five ="5";
        Integer integer =Integer.valueOf(five);
        System.out.println("integer "+ integer);
    }
}
