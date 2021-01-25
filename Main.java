package com.learnJava;

public class Main {

    public static void main(String[] args) {
             //multidimensional Array
        int firsstArray [][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};

        // Less give a line break here.
        System.out.println();

        // This is printing out the length of each row of the Array
        System.out.println("The length of the Array (firstArray) = " + firsstArray.length);

        // Less give another line break.
        System.out.println();


           /*  Here we are creating a for-loop to describing by printing to the console each
               length of the Array(firstArray) rows.
           */

        for (int m = 0; m < firsstArray.length; m++){

             System.out.print("Row " + (m + 1) + " of 'firstArray' length is Equals to " + firsstArray[m].length);

            System.out.println();
        }


           // Another line break and a simple text on the console
        System.out.println();
        System.out.println("Here comes the table of Array");

            // Here I'm designing the print-out of the Array in a table form
        System.out.println("===============================");


           /* Displaying or printing the Array on the console
              by calling the displayArray method and passing the arg. firstArray.
           */
        displayArray(firsstArray);

        System.out.println("===============================");
        System.out.println("This is the End of the Table");

    }

        // Here I'm creating a static Method called displayArray to be
        // later called in the main Method which happens to be our entry point in our Application.
    public static void displayArray (int myArray [][]){


              // Here I'm just creating a for loop through the Array length
              // as we can see that the variable c will always be less than myArray.length
        for (int c = 0; c < myArray.length; c++){

                 /*
                    this other for loop is looping through each row in the
                    multidimensional Array as we can see that, the variable d will
                    always be less than the length of each Array row in the Array-dimension
                 */
            for (int d = 0; d < myArray[c].length; d++){

                   // this is just printing out to the console the value of each index in the
                   // multidimensional Array of type int
                System.out.print(myArray[c][d] + "\t");

            }

             // finally this is just moving the cursor to the next line after each loop.
            System.out.println();
        }

    }
}
