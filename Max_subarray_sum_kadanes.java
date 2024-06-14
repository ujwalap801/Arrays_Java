//using Kadanes's Algorithm
public class Max_subarray_sum_kadanes {

    public static void printSubArray(int n[])
    {
        int maxSum =Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0;i<n.length;i++)
        {
            currSum +=n[i];
            if(currSum < 0)
            {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
            
        }
        System.out.println("max subarray sum : "+maxSum);

    }
    public static void main(String[] args) {
        int n[] ={-2, -3, 4,-1,-2,1, 5, -3};
        printSubArray(n);
    }
}
