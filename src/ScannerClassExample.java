
import java.util.Scanner;


public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the roll no");
        int roll=sc.nextInt();
        System.out.println("Enter the age");
       // float age=sc.nextFlot();
        float age= sc.nextFloat();
        System.out.println("Enter the name "+name );
        System.out.println("Enter the roll "+ roll);
        System.out.println("Enter the age "+ age);
    }



}
