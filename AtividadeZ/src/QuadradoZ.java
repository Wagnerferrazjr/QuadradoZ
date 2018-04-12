import java.util.Scanner;

public class QuadradoZ {
	
	private String[][] letras;
	private int linhas;
	private int colunas;

	public QuadradoZ() {
	}

	public void desenhar() {

	    //cria scanner de entrada do usu�rio
	    Scanner sc = new Scanner(System.in);
	    //cria array com todas as letras do alfabeto
	    String[] lt = "A,B,C,D,E,F,G,H,I,J,L,M,N,O,P,Q,R,S,T,U,V,X,Z,W,Y,K".split(",");
	    //pede n�mero n para o usu�rio
	    System.out.print("Informe a quantidade de n >>>> ");
	    linhas = sc.nextInt();
	    colunas = linhas;

	    System.out.println("\n\n--------------Resultado-------------\n");

	    //verifica se n � maior ou igual a 3
	    if (linhas >= 3 && colunas >= 3) {

	        //cria array bidimensional para guardar o Z
	        letras = new String[linhas][colunas];
	        //aloca local da letra das linhas centrais
	        int z = colunas - 1;
	        //aloca valor de repeti��o para array de letras
	        int f = 0;

	        //inicia loop para linhas
	        for (int l = 0; l < linhas; l++) {
	            //inicia loop para colunas
	            for (int c = 0; c < colunas; c++) {
	                //verifica se � a primeira ou �ltima linha, caso n�o...
	                if (l > 0 && l < (linhas - 1)) {
	                    //verifica se � o local de impress�o da letra
	                    if (c == z) {
	                        letras[l][c] = lt[f];
	                    } else { //caso n�o seja imprimi espa�o em branco
	                        letras[l][c] = " ";
	                    }
	                } else { //caso seja a primeira ou �ltima linha imprime uma letra por coluna
	                    letras[l][c] = lt[f];
	                }
	                //verifica se o loop j� utilizou todas as letras, caso sim reinicia o array de letras
	                f = f == 25 ? 0 : ++f;
	            }
	            //indica local de impriss�o da letra nas linhas centrais
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
	        System.out.println("As linhas e colunas devem obrigat�riamente ter um n�mero maior ou igual a 3");
	    }

	}

	public static void main(String[] args) {
	    new QuadradoZ().desenhar();
	}

}
