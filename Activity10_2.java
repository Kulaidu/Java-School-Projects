import java.util.Scanner;
public class Activity10_2 {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = uwu.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}