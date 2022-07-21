public class Activity10_3 {
    public static void main(String[] args) {
        int number = 10;
        do{
            int result = number*number;
            System.out.print(" Square of "+number+"="+result+"||");
            System.out.print(" Sqaure root of "+result+"="+Math.sqrt(result));
            --number;
            System.out.print("\n");
        }while(number>=0);
    }
}
