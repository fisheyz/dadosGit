
import java.util.Scanner;

// Classe para representar um jogo
class Game {
    final char DEAD  = '.';  // Constante que indica uma celula morta
    final char ALIVE = 'O';  // Constante que indica uma celula viva
    private int rows, cols;  // Numero de linhas e colunas
    private char m[][];      // Matriz para representar o estado do jogo

    // Construtor: inicializa as variaveis tendo em conta a dimensao dada
    Game(int r, int c) {
	rows = r;
	cols = c;
	m = new char[r][c];
    }

    // Metodo para ler o estado inicial para a matriz m[][]
    public void read(Scanner in) {
	for (int i=0; i<rows; i++)
	    m[i] = in.next().toCharArray();
    }
    
    // Metodo para escrever a matriz m[][]
    public void write() {
	for (int i=0; i<rows; i++){
	    System.out.println();
	    for (int j=0; j<cols; j++)
		System.out.print(m[i][j]);
	} 
	System.out.println();

    }

    // Deve devolver o numero de celulas vivas que sao vizinhas de (y,x)
    public int countAlive(int y, int x) {
	int count = 0;
	for(int i = y-1; i<=y+1 && i<rows ;i++)
	    for(int j=x-1;j<=x+1 && j<cols; j++)
		    if ( m[i][j]=='o') 
			count++;
	return count-1;
    }

    // Deve fazer uma iteracao: cria nova geracao a partir da actual
    public void iterate() {
	char m2[][]=new char[rows][cols];
	for(int i=0; i<rows;i++)
	    for(int j=0; j<cols;j++){
		if (m[i][j] == 'o' && countAlive(i, j) == 2 || countAlive(i, j) == 3) 
		    m2[i][j] = 'o';
		else 
		    m2[i][j] = '.';
		if (m[i][j] == '.' && countAlive(i, j) == 3)
		    m2[i][j] = 'o';
	    }	 		      
    }

}

// Classe principal com o main()
public class Prob088 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	// Ler linhas, colunas e numero de iteracoes
	int rows = in.nextInt();
	int cols = in.nextInt();
	int n    = in.nextInt();

	// Criar objecto para conter o jogo e ler estado inicial
	Game g = new Game(rows, cols);
	g.read(in);
	g.write();
	System.out.println("count=" + g.countAlive(1, 1));
	//... por completar
    }
}
