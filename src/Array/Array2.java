package Array;
import java.util.Scanner;

public class Array2 {

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
         for(int j=i+1;j<n;j++){
             int temp=0;
           if(arr[i]>arr[j])
           {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
          
         }
            System.out.println(arr[i]);

        }


    }
}
