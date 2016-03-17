class Sopa{
  public int rows, cols;
  private char m[][];

  Sopa(int r, int c){
    rows = r;
    cols = c;
    m = new char[r][c];
  }
  public void read(Scanner in){
    for(int i=0;i<rows;i++)
      m[i]=in.next().toCharArray();
  }
}

public class Prob015{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int cols = in.nextInt();

    Sopa s = new Sopa(rows, cols);
    g.read(in);
  }
}
