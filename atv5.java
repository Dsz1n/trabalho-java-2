import java.util.Scanner;

public class Atv5 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.println("Digite 5 números para o vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        System.out.print("Digite o número n: ");
        int n = ler.nextInt();

        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == n) {
                quantidade++;
            }
        }

        System.out.println("O número " + n + " aparece " + quantidade + " vezes no vetor.");
    }
}