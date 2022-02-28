package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store:");
        int n= sc.nextInt();
        int[] arr=new int[10]; //creates an array in the memory of length 10
        System.out.println("Enter the value");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();  ////reading array elements from the user
        }
        System.out.println("showing array element");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);  // accessing array elements using the for loop
        }
    }

}
