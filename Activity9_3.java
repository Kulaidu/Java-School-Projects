import java.io.*;
public class Activity9_3 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String yearLevel = "";
       
        System.out.print("Please Enter your Year Level\n(Type 1, 2, 3 or 4) : ");
        yearLevel = dataIn.readLine();

        switch (yearLevel){
            case "1":
            System.out.println(" You're a Freshman");
            break;

            case "2":
            System.out.println(" You're a Sophomore");
            break;

            case "3":
            System.out.println(" You're a Junior");
            break;

            case "4":
            System.out.println(" You're a Senior");
            break;

            default:
            System.out.println(" Year Level Not Matched");
            break;
            }
    }
}
