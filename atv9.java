import java.util.Scanner;

public class Atv9 {
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

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetorB[i] = ler.nextInt();
        }

        int[] vetorC = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) { // Posição par
                vetorC[i] = vetorA[i];
            } else { // Posição ímpar
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("Vetor C:");
        System.out.println(Arrays.toString(vetorC));
    }
}