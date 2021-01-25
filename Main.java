package com.learnJava;

public class Main {

    public static void main(String[] args) {

        int firsstArray [][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};

        System.out.println();

        System.out.println("The length of the Array (firstArray) = " + firsstArray.length);
        System.out.println();

        for (int m = 0; m < firsstArray.length; m++){

             System.out.print("Row " + (m + 1) + " of 'firstArray' length is Equals to " + firsstArray[m].length);

            System.out.println();
        }

        System.out.println();
        System.out.println("Here comes the table of Array");


        System.out.println("===============================");


        displayArray(firsstArray);

        System.out.println("===============================");
        System.out.println("This is the End of the Table");

    }

    public static void displayArray (int myArray [][]){

        for (int c = 0; c < myArray.length; c++){

            for (int d = 0; d < myArray[c].length; d++){

                System.out.print(myArray[c][d] + "\t");

            }
            System.out.println();
        }


    }
}
