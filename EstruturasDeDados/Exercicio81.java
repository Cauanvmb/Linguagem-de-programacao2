package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorQ = new int[20];

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
                vetorQ[i] = scanner.nextInt();
            } while (vetorQ[i] <= 0); 
        }

        int menorElemento = vetorQ[0];
        int posicaoMenorElemento = 0;

        for (int i = 1; i < 20; i++) {
            if (vetorQ[i] < menorElemento) {
                menorElemento = vetorQ[i];
                posicaoMenorElemento = i;
            }
        }

        System.out.println("O menor elemento é " + menorElemento + " e ocupa a posição " + (posicaoMenorElemento + 1) + " no vetor.");

        scanner.close();
    }
}
