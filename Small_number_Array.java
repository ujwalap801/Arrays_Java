//smallest Number in the given array

public class Small_number_Array {
    public static void printSmallest(int num[])
    {
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<num.length; i++)
        {
            if(num[i] < smallest)
            {
                smallest = num[i];
            }
        }
        System.out.println("Smallest Number in the given array : " +smallest);
    }
    public static void main(String[] args) {
        int num[] ={3,6,18,1,40,67};
        printSmallest(num);

    }
}
