import java.io.*;
import java.util.*;

class spiral{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int count=0, x=0, y=0, k=0;

    while(count!=n){
      k++;
      for(int i=0; i < k;  count++, i++){x++;}


      for(int i=0; i<k; count++, i++){y--;}

        k++;
      for(int i=0; i<k; k++, count++, i++){x--;}

      for(int i=0; i<k; count++, i++){y++;}

    }
    System.out.println( x +" " + " "+ y);
  }
}
