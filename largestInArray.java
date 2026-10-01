/*
LargestInArray
Jacob Hartzell
9/30/26
This program prompts the user to enter an array and displays the largest value in said array entered.
*/

import java.util.Scanner;

public class largestInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        System.out.println("Enter the array: ");
        double[][] arr = new double[rows][cols];
        for (int c = 0; c < rows; c++) {
            for (int d = 0; d < cols; d++) {
                arr[c][d] = input.nextDouble();
            }
        }
        input.close();
        int[] location = locateLargest(arr);

        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }

    /** 
     * The locate largest method finds the largest element 
     * in the array that the usr gives, it also checks if the array is empty
     * 
     * @param double[][]  is a 2d array that is used to search through elements
     * @return an array of 2 integers that contain the x and y values of the largest number
     * */
    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2]; // stores [row, col]
        
        if (a.length == 0 || a[0].length == 0) {
            return location;
        }

        double maxElement = a[0][0];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxElement) {
                    maxElement = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        return location;
        
    }
}