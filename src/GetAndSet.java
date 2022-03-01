// Java Program to Illustrate Getter and Setter

// Importing input output classes
import java.io.*;

class GetSet1 {

    // Member variable of this class
    private int num;

    // Method 1 - Setter
    public void setNumber(int number)
    {

        // Checking if number if between 1 to 10 exclusive
        if (number < 1 || number > 10) {

            throw new IllegalArgumentException();
        }
        num = number;
    }

    // Method 2 - Getter
    public int getNumber() { return num; }
}

// Class 2
// Main class
class GetAndSet {

    // Main driver method
    public static void main(String[] args)
    {
        GetSet1 obj = new GetSet1();

        // Calling method 1 inside main() method
        obj.setNumber(15);

        // Printing the number as setted above
        System.out.println(obj.getNumber());
    }
}

