import java.util.Scanner;
public class quesito2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somatotal = 0;
        int somaCol0 = 0;
        int prodLin0 = 1;
        int somaDiag = 0;
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; ++i){
            for (int j = 0; j < matriz[i].length; ++j){
                System.out.printf("Digite um valor inteiro para a posição [%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();
                somatotal += matriz[i][j]; 
                if (i == 0) {
                    prodLin0 *= matriz [i][j];
                }
                if (j == 0) {
                    somaCol0 += matriz[i][j];
                }
                if (i == j) {
                    somaDiag += matriz[i][j];
                }
            }
        }
        System.out.printf("Soma total dos elementos: %d%n",somatotal);
        System.out.printf("Soma dos elementos da primeira coluna: %d%n", somaCol0);
        System.out.printf("Produto dos elementos da primeira linha: %d%n",prodLin0);
        System.out.printf("Soma dos elementos da diagonal principal: %d%n", somaDiag);
    }
}
