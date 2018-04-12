import java.util.Scanner;

public class QuadradoZ {
	
	private String[][] letras;
	private int linhas;
	private int colunas;

	public QuadradoZ() {
	}

	public void desenhar() {

	    //cria scanner de entrada do usuário
	    Scanner sc = new Scanner(System.in);
	    //cria array com todas as letras do alfabeto
	    String[] lt = "A,B,C,D,E,F,G,H,I,J,L,M,N,O,P,Q,R,S,T,U,V,X,Z,W,Y,K".split(",");
	    //pede número n para o usuário
	    System.out.print("Informe a quantidade de n >>>> ");
	    linhas = sc.nextInt();
	    colunas = linhas;

	    System.out.println("\n\n--------------Resultado-------------\n");

	    //verifica se n é maior ou igual a 3
	    if (linhas >= 3 && colunas >= 3) {

	        //cria array bidimensional para guardar o Z
	        letras = new String[linhas][colunas];
	        //aloca local da letra das linhas centrais
	        int z = colunas - 1;
	        //aloca valor de repetição para array de letras
	        int f = 0;

	        //inicia loop para linhas
	        for (int l = 0; l < linhas; l++) {
	            //inicia loop para colunas
	            for (int c = 0; c < colunas; c++) {
	                //verifica se é a primeira ou última linha, caso não...
	                if (l > 0 && l < (linhas - 1)) {
	                    //verifica se é o local de impressão da letra
	                    if (c == z) {
	                        letras[l][c] = lt[f];
	                    } else { //caso não seja imprimi espaço em branco
	                        letras[l][c] = " ";
	                    }
	                } else { //caso seja a primeira ou última linha imprime uma letra por coluna
	                    letras[l][c] = lt[f];
	                }
	                //verifica se o loop já utilizou todas as letras, caso sim reinicia o array de letras
	                f = f == 25 ? 0 : ++f;
	            }
	            //indica local de imprissão da letra nas linhas centrais
	            z--;
	        }

	        //loop que imprime o z no prompt
	        for (int l = 0; l < letras.length; l++) {
	            for (String str : letras[l]) {
	                System.out.print(str);
	            }
	            System.out.println("");
	        }

	    } else {
	        System.out.println("As linhas e colunas devem obrigatóriamente ter um número maior ou igual a 3");
	    }

	}

	public static void main(String[] args) {
	    new QuadradoZ().desenhar();
	}

}
