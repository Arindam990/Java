package Array;

import java.util.ArrayList;

public class Array3 {
    // Linear-search function to find the index of an element
    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex1(my_array, 18));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));

    }
    public static int findIndex1(int arr[], int t)
    {
        // Creating ArrayList
        ArrayList<Integer> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (int i : arr)
            clist.add(i);

        // returning index of the element
        return clist.indexOf(t);
    }
}