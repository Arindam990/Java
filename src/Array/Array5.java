package Array;

import java.util.Scanner;

public class Array5 {
   /* public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the String value");
        for(int i=0;i<=n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("showing the string array");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]);
        }
    }*/
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store:");
        //int n= sc.nextInt();
        String[] arr=new String[5] ; //creates an array in the memory of length 10
        System.out.println("Enter the value");

        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextLine();  ////reading array elements from the user
        }
        System.out.println("showing array element");

        System.out.println(arr.length);
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);  // accessing array elements using the for loop
        }
    }
}
