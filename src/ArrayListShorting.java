


import java.util.*;

public class ArrayListShorting {
    public static void main(String args[])
    {

        // Get the ArrayList
        ArrayList<String>
                list = new ArrayList<String>();

        // Populate the ArrayList
        list.add("Geeks");
        list.add("10");
        list.add("ForGeeks");
        list.add("GeeksForGeeks");
        list.add("A computer portal");
        list.add("50.45");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: "
                + list);

        // Sorting ArrayList in ascending Order
        // using Collection.sort() method
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList "
                + "in Ascending order : "
                + list);

        // Shorting arraylist in descending order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
        // showing value of particular index
        System.out.println("The element at index two is " + list.get(1));
        //showing index of particular value
        System.out.println("The element at index two is " +list.indexOf("ForGeeks"));


        //// adding item from particular index
        System.out.println("The element at index two is " + list.set(3,"dip"));
        //total size of array list
        System.out.println("The size of the List is " + list.size());
        // adding item from particular index
        list.add(5,"Arindam");
        System.out.println(list);
        // creating an another list to store the final data.
        ArrayList<String>
                newlist = new ArrayList<String>();

        for(int i=0;i<=list.size()-1;i++){

            // for checking purpose

            //if (list.get(i).contains("F")){
              //continue;
            //}
            if(list.get(i).charAt(0)=='F'){
                continue;
            }

            newlist.add(list.get(i));
        }
        System.out.println(newlist);
    }
}
