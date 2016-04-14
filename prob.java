import java.util.*;

class prob{
  public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i<n;i++){
	
	if (npi(in)==-1)
	    System.out.println("Expressao Incorrecta");
	else
	    System.out.println(npi(in));
	   
    }
  }

  public static int npi(Scanner in){
    char op;
    Integer x,y;
    Stack<Integer> s = new Stack<Integer>();
    
    while (in.hasNext()){
	
	if (in.hasNextInt())
	    s.push(new Integer(in.nextInt()));
	else{
	    
	    op = in.next().charAt(0);
	    
	    if(s.size() <2)
		return -1;
	    
	    x = s.pop();
	    y = s.pop();
	    s.push(new Integer(contas(x,y,op)));
	}
    }
    return s.pop();
 
  }
  public static int contas(int x, int y, char op){
    if (op == '+')
    return x + y;
    else if(op =='*')
    return x*y;
    else if (op == '-')
    return Math.abs(x-y);
    else
    return (int)x/y;
  }
}
