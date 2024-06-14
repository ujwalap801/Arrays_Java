//max Subarray sum. Time complexity: O(N)^3
public class Max_subarray_sum_BruteForce {
    public static void printSumSubArray(int n[])
    {
      int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            int start =i;
            for(int j= i;j<n.length;j++)
            {
                int end =j;
                int currSum =0;
                for(int k = start ;k<=end ;k ++)
                {
                    currSum += n[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum )
                {
                    maxSum =currSum;
                }
            }
        }
        System.out.println("maxsum "+maxSum);
    }
    public static void main(String[] args) {
    
        int n[] ={1, -2, 6, -1, 3};
        printSumSubArray(n);
    }
}
