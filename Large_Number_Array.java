// Largest Number from Array

public class Large_Number_Array {

    public static void printLargest(int num[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<num.length;i++)
        {
            if(num[i] >largest)
            {
                largest =num[i];
            }
        }
        System.out.println("Largest Number int the given error : " +largest);

    }
    public static void main(String[] args) { 
    int num[] ={1,2,6,8,4,10};
    printLargest(num);

    }
}
