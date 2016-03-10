import java.io.*;
import java.util.*;
import java.lang.Math;

class justabetterspiral{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int count=n,x=0, y=0,k=0;
    int root=(int)Math.sqrt(n);

    if (root*root == n){
      x=(int)root/2;
      y=(int)root/2;
      System.out.println("("+x+ "," +y+")");
    }
    else{
     int test=(int)Math.sqrt(n)+1;
     if (test%2==0)
      test=test+1;
      else
        test=test+2;
     int teste=test*test;
     x=(int)test/2;
     y=(int)test/2;
     k = test-1;

     for(int i=0; i<k  && teste > n; i++,teste-- ){x--;}
     for(int i=0; i<k && teste > n; i++, teste--){y--;}
     for(int i=0; i<k && teste > n; i++, teste--){x++;}
     for(int i=0; i<k && teste >n ; i++, teste--){y++;}
     System.out.println("("+x+ "," +y+")");
   }
  }
}
