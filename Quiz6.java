import java.io.*;
public class Quiz6{
    public static void main(String[] args){

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String cy = "";
        String by = "";

        System.out.print("Current Year: ");
        try{
            cy = dataIn.readLine();
        }
        catch(IOException e){
            System.out.println("There is an error in your code!");
        }

        System.out.print("Birth Year: ");
        try{
            by = dataIn.readLine();
        }
        catch(IOException e){
            System.out.println("There is an error in your code!");
        }
        
        int currentYear = Integer.parseInt(cy);
        int birthYear = Integer.parseInt(by);
        int age = currentYear-birthYear;
        System.out.println("Your age is "+age+".");

    }
}