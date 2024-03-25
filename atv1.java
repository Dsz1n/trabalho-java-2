import java.util.Scanner;

public class Atv1 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[5];
        double soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = ler.nextInt();
            soma += vetor[i];
        }

        double media = soma / 5;
        System.out.println("Média: " + media);

        System.out.println("Valores menores que a média:");
        for (int num : vetor) {
            if (num < media) {
                System.out.println(num);
            }
        }

        System.out.println("Valores iguais à média:");
        for (int num : vetor) {
            if (num == media) {
                System.out.println(num);
            }
        }

        System.out.println("Valores superiores à média:");
        for (int num : vetor) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }
}