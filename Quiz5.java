import java.util.Scanner;
public class Quiz5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String status = "";
        int num;

        System.out.print("Enter a number:");
        num = n.nextInt();
        
        status = (num%2==0)?" is EVEN.":" is ODD.";
        System.out.println(num + status);
        
    }
    
}
