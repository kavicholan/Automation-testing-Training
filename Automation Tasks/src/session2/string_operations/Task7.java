package session2.string_operations;
//Task 7. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name/
// which is displayed as it is.For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
public class Task7 {
    public static void main(String[] args) {
        String name = ("Mahendra Singh Dhoni");
        String[] arrofname = name.split(" ");
        System.out.print(Character.toUpperCase(arrofname[0].charAt(0)) + ". ");
        System.out.print(Character.toUpperCase(arrofname[1].charAt(0)) + ". ");
        System.out.println(arrofname[2]);

    }
}