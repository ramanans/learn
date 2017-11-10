// Java program to find missing Number
// using xor
public class FindMissingNo
{
    // Function to find missing number
    static int getMissingNo (int a[], int n)
    {
        int i;
        int x1 = a[0]; 
        int x2 = 1; 
         
        /* For xor of all the elements 
           in array */
        for (i = 1; i< n; i++){
            x1 = x1^a[i];
        
            System.out.println(x1);
        }
         System.out.println("---------------");         
        /* For xor of all the elements 
           from 1 to n+1 */        
        for ( i = 2; i <= n+1; i++){
            x2 = x2^i;         
            System.out.println(x2);
        }
          System.out.println("---------------");  
        return (x1^x2);
    }
      
    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6,7,8,9,3,11};
        int miss = getMissingNo(a,a.length);
        System.out.println(miss);
    }
}
