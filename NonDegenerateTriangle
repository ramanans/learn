// Java program to find if it is 
// possible to form a triangle 
// from array values
import java.io.*;
import java.util.Arrays;
 
class NonDegenerateTriangle 
{
     
    // Method prints possible 
    // triangle when array values
    // are taken as sides
    static boolean isPossibleTriangle(int []arr,
                                      int N)
    {
         
        // If number of elements are 
        // less than 3, then no 
        // triangle is possible
        if (N < 3)
            return false;
     
        // first sort the array
        Arrays.sort(arr);
     
        // loop for all 3 
        // consecutive triplets
        for (int i = 0; i < N - 2; i++)
     
            // If triplet satisfies 
            // triangle condition, break
            if (arr[i] + arr[i + 1] > arr[i + 2])
                return true;
                 
        return false;
    }
     
    // Driver Code
    static public void main (String[] args)
    {
        int []arr = {5, 4, 3, 1, 2};
        int N = arr.length;
         
        if(isPossibleTriangle(arr, N))
            System.out.println("Yes" );
        else
            System.out.println("No");
    }
}
 
// This code is contributed by vt_m.
