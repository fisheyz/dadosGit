import java.util.*;

class los{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int m = k, n = k, j=1;

    while (k-1 >= 0){


      for (int i = 0; i<n;i++){
        if (  i >= n/2+j || i <= n/2-j)
          System.out.print(".");
        else
          System.out.print("#");
        }
        System.out.println();

        if (k <= m/2+1)
        j--;
        else
        j++;

        k--;
    }
  }
}
