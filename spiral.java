import java.io.*;
import java.util.*;

class spiral{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int count=1;
    int x=0;
    int y=0;
    int k=0;

    while(count<n ){
      k++;
      for(int i=0; i < k && count <=n;  count++, i++){x++;}
      System.out.println(x+""+""+y);

      for(int i=0; i<k && count <=n; count++, i++){y--;}
      System.out.println(x+""+""+y);
      k++;
      for(int i=0; i<k && count <=n;  count++, i++){x--;}
      System.out.println(x+""+""+y);
      for(int i=0; i<k && count <=n; count++, i++){y++;}
      System.out.println(x+""+""+y);
    }
    System.out.println( y+ "" + " "+x);
  }
}
