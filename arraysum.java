import java.util.Arrays;
import java.util.Scanner;

public class arraysum {
      public static void sum(int A[],int s){
          for(int i=0;i<A.length;i++)
          {
              for(int j=i+1;j<A.length;j++)
              {
              if(A[i]+A[j]==s) {
                  System.out.println("pair is found" + i + "," + j);
              }

    }}}
    public static void main(String[] args)
    {
        int []A={1,2,3,5,56,36};
        int s=8;
        sum(A,s);
        System.out.println(Arrays.toString(A));
    }
}
