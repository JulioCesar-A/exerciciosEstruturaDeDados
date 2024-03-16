import java.util.Scanner;
public class ExercicioVetor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];
        int menorvalor = 999999999;
        int contacimam = 0;
        int somatotal = 0;
        for (int i = 0; i < vetor.length; ++i){
            System.out.printf("Digite um valor inteiro (de até 9 dígitos) para a posição [%d]: ", i);
            vetor[i] = entrada.nextInt();
            somatotal += vetor[i];
        }
        int media = somatotal/vetor.length;
        for (int j = 0; j < vetor.length; j++){
            if (vetor[j] > media){
                contacimam += 1;
            }
            if (vetor[j] < menorvalor){
                menorvalor = vetor[j];
            }
            if (vetor[j] % 2 == 0){
                System.out.printf("%d - Posição [%d] - Par%n", vetor[j], j);
            }
        }
        System.out.printf("Média dos valores do vetor: %d%nQuantidade de números acima da média: %d%nMenor valor: %d", media, contacimam, menorvalor);
    }
}
