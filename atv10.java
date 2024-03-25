import java.util.Scanner;

public class Atv10 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        int tamanho = 5;

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = ler.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B (cópia de A invertida): ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}