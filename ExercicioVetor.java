// import java.util.Scanner;
// public class ExercicioVetor {
//     public static void main(String[] args){
//         Scanner entrada = new Scanner(System.in);
//         int[] vetor = new int[5];
//         int menorvalor = 999999999;
//         int contacimam = 0;
//         int qtdcont = 0;
//         int somatotal = 0;
//         for (int i = 0; i < vetor.length; ++i){
//             System.out.printf("Digite um valor inteiro (de até 9 dígitos) para a posição [%d]: ", i);
//             vetor[i] = entrada.nextInt();
//             somatotal += vetor[i];
//         }
//         double media = somatotal/vetor.length;
//         for (int j = 0; j < vetor.length; j++){
//             if (vetor[j] > media){
//                 contacimam += 1;
//             }
//             if (vetor[j] < menorvalor){
//                 menorvalor = vetor[j];
//                 qtdcont = 1;
//             } else if (vetor[j] == menorvalor) {
//                 qtdcont += 1;
//             }
//             if (vetor[j] % 2 == 0){
//                 System.out.printf("%d - Posição [%d] - Par%n", vetor[j], j);
//             }
//         }
//         System.out.printf("Média dos valores do vetor: %2f%nQuantidade de números acima da média: %d%nMenor valor: %d%nNúmero de incidência do menor valor: %d", media, contacimam, menorvalor, qtdcont);
//     }
// }

import java.util.Scanner;

public class ExercicioVetor {

    // Faça um programa que imprima QUANTOS NÚMEROS SAO MAIORES QUE A MÉDIA
    // E QUANTAS VEZES OS NÚMEROS MAIORES QUE A MÉDIA APARECEM
    public static void main(String[] args) {
        int vetor[] = new int[20];
        int maiorQueAMedia = 0;
        int qtdMaiorQueAMedia = 0;
        int somaDoDiaboDosNumeros = 0;


        Scanner numeros = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o diabo dos números: ");
            vetor[i] = numeros.nextInt();
            somaDoDiaboDosNumeros += vetor[i];
        }
        double media = somaDoDiaboDosNumeros / vetor.length;

        System.out.println("Média desses diabos: " + media);

        for(int in = 0; in < vetor.length; in++) {
            if (vetor[in] > media) {
                qtdMaiorQueAMedia = qtdMaiorQueAMedia + 1;
            }
        }

        System.out.println("Quantas vezes o diabo dos números foi maior que a média: " + qtdMaiorQueAMedia);
    }
}
