import java.util.Scanner;
public class Activity3{
    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);
        String name; //The user's name.
        String email; //The user's email address.
        double salary; //The user's yearly salary.
        String favColor; //The user's favorite color.

        System.out.println("Good Afternoon! This program will create your profile file, if you will just answer a few simple questions");
        System.out.print("What is your name? ");
        name = stdin.nextLine();
        System.out.print("What is your email address? ");
        email = stdin.nextLine();
        System.out.print("What is your yearly income? ");
        salary = stdin.nextDouble();
        System.out.print("What is your favorite color? ");
        favColor = stdin.next();

        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Favorite Color: "+favColor);
        System.out.println("Yearly Income: "+salary);
        System.out.println("Thank you " + name + ". Your profile has been recorded.");
    }
}