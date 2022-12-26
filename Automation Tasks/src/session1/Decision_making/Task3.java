package session1.Decision_making;
//Task3: Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
public class Task3 {
    public static void main(String[] args) {
        int day=5;
        String weekdays = "1,2,3,4,5,6,7";

        switch(day){

            case 1: weekdays="1 - Sunday";
                break;
            case 2: weekdays="2 - Monday";
                break;
            case 3: weekdays="3 - Tuesday";
                break;
            case 4: weekdays="4 - Wednesday";
                break;
            case 5: weekdays="5 - Thursday";
                break;
            case 6: weekdays="6 - Friday";
                break;
            case 7: weekdays="7 - Saturday";
                break;
        default:System.out.println("Invalid day");
    }
        System.out.println(weekdays);

    }
}
