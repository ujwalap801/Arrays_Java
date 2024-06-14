//pairs in Array
public class Pairs_Array {
    public static void main(String[] args) {
        int n[]={2, 4, 6, 8, 10};
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                System.out.println("(" +n[i] +", "+ n[j]+ ")");
            }
            System.out.println();
        }
    }
}
