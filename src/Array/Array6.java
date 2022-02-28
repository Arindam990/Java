package Array;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store:");
        //int n= sc.nextInt();
        String[] arr=new String[5] ; //creates an array in the memory of length 10
        System.out.println("Enter the value");

        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextLine();  ////reading array elements from the user
        }

        String[] arr1=new String[5] ; //creates an array in the memory of length 10
        System.out.println("Enter the value");

        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextLine();  ////reading array elements from the user
        }
        String[]result=DublicateArray(arr,arr1);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static String[] DublicateArray(String[]arr,String[]arr1){
        String[]result=new String[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr1.length;j++){
                if(arr[i]==arr1[j]){
                  result[k++]=arr[i++];
                }
            }
        }
        return result;
    }
}
