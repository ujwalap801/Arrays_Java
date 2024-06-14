//LinearSearch
public class Linear_Search {
    public static  int linearSearch(int num[], int key)
    {
        for(int i =0; i<num.length;i++)
        {
            if(num[i] == key)
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) { 
        int num[] = {2, 5, 9, 6, 3, 4};
        int key =3;
        int result= linearSearch(num, key);
        if(result == 0)
        {
           System.out.println("element not found");
        }
      else{
        System.out.println("element found at index: "+result);
       }
    }
}
