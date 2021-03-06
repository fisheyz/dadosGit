import java.io.*;
import java.util.*;

// classe que define uma matriz
class Matriz {
    private int A[][]; // matriz
    private int NL;    // num. linhas
    private int NC;    // num. colunas

    // método construtor - inicializa um objecto matriz
    Matriz(int n, int m) {
	A= new int[n][m];
        NL= n;
        NC= m;
    }

    // leitura dos NLxNC elementos da matriz

    public static void matrixShow(Matriz m){
	for (int lin = 0; lin < m.NL; lin++){
	    System.out.println();
	    for (int col=0; col < m.NC; col++)
		System.out.print(m.A[lin][col] + " ");
	}
    }

    public static Matriz matrixProd(Matriz m, Matriz n){
	if (m.NC != n.NL){
	    System.out.print("cannot multiply");
	    return System.out.println("cannot");
	}
	Matriz mn = new Matriz(m.NC, n.NL);
	for(int lin=0; lin < m.NC; lin++)
	    for(int col=0; col<n.NL; col++){
		int sum=0;
		for(int k=0; k<m.NC; k++)
		    sum = sum + m.A[lin][k]*n.A[k][col];
		mn.A[lin][col]=sum;

	    }
	return mn;
    }
    public void leMatriz(Scanner in) {
	
	for (int i=0; i<NL; i++)
	    for (int j=0; j<NC; j++)
		A[i][j]= in.nextInt();

    }
    public int maiorElemento() {
	int maior; 

	maior= A[0][0]; // maior começa por ser este valor

        for (int lin= 0; lin < NL; lin++) 
	    for (int col= 0; col < NC; col++) {
		if (maior < A[lin][col])
		    maior= A[lin][col];
	    }
	return maior;
    }

    
}

// classe principal do programa

class MatTest {

    public static void main(String args[]) {

	// canal de leitura
	Scanner stdin = new Scanner(System.in); 
	Matriz a; // objecto representando uma matriz

	// ler o num. linhas e num. colunas
	int nl= stdin.nextInt();
        int nc= stdin.nextInt();

        // cria o objecto matriz, coma a dimensão lida
        a= new Matriz(nl,nc);

	// ler os valores da matriz
	a.leMatriz(stdin);	

	//calcula o maior elemento da matriz e escreve-o
	System.out.printf("Maior valor da matriz: %d\n", a.maiorElemento());
	Matriz.matrixShow(Matriz.matrixProd(a, a));
	System.out.println();

    }
}
