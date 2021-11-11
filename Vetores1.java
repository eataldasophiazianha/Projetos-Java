import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
        final int TAMANHO = 100;
        double[] valores = new double[TAMANHO];

        int tamanhoAtual = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite os valores numéricos: ");
        while (in.hasNextDouble()) {
            if (tamanhoAtual < valores.length) {
                valores[tamanhoAtual] = in.nextDouble();
                tamanhoAtual++;
            }
        }

        // Imprime o laço.
        System.out.println("Você digitou " + tamanhoAtual + " valores numéricos.");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(valores[i] + " ");
            
        }

    }
}
