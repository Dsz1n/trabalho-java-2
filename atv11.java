import java.util.Scanner;

public class Atv11 {
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

        int produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        System.out.println("O produto escalar entre os vetores A e B é: " + produtoEscalar);
    }
}