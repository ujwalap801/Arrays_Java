//Binary Search
public class Binary_Search {
   public static int printBinarySearch(int num[],int key)
    {
        int start = 0;
        int end =num.length-1;
        while (start <=end) {
            int mid =(start+end)/2;
            if(num[mid] == key)
            {
                return mid;
            } 
            else if(num[mid] < key)
            {
               
               start =mid+1;
            }
            else{
                end =mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int num[] ={2, 4, 6, 8, 10, 12, 14};
        int key = 10;
       if(printBinarySearch(num, key) == 0)
       {
        System.out.println("number not found");
       }
       else{
        System.out.println("number found at index : " +printBinarySearch(num, key));
       }
    }
}
