import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {

        // Instantiation of Scanner class
        Scanner in = new Scanner(System.in);

        // Set the number of temperatures to analyse
        System.out.println("Enter the number of temperatures to analyse ▼");
        int n = in.nextInt();

        switch (n) {
            case 0:
                System.out.println(0);
                break;
        
            default:
                // Input numbers into arr
                System.out.println("Please enter " + n + " random numbers ▼");
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    int t = in.nextInt();
                    arr[i] = t;
                }

                // Find the number closest to 0
                int result = arr[0];
                for(int i = 0; i < arr.length; i++){
                    for(int j = i + 1; j < arr.length; j++){
                        if(Math.abs(arr[j]) < Math.abs(result)){
                                result = arr[j];
                        }else if(Math.abs(arr[j]) == Math.abs(result)){
                            if(result < 0 && 0 < arr[j]) result = arr[j];
                        }
                    }
                }
                System.out.println("The number closest to 0 is: " + result);
                break;
        }
    }
}