import java.util.Arrays;
import java.util.Scanner;

public class LeituraVetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leitura de dados para um vetor quando o tamanho do mesmo é conhecido.
        // final int QTD_DE_VALORES = 5;
        // double[] entradas = new double[QTD_DE_VALORES];
        // for (int i = 0; i < entradas.length; i++) {
        //     entradas[i] = in.nextDouble();
        // }
        // System.out.println(Arrays.toString(entradas));
        // for (double entrada : entradas) {
        //     System.out.print(entrada + " ");
        // }

        // Lê um número arbitrário de valores do teclado (v1)
        // double[] entradas = new double[5];
        // int tamanhoAtual = 0;
        // while (in.hasNextDouble() && tamanhoAtual < entradas.length) {
        //     entradas[tamanhoAtual] = in.nextDouble();
        //     tamanhoAtual++;
        // }
        // System.out.println(tamanhoAtual + "-" + Arrays.toString(entradas));
        //
        // // Cria um novo vetor cópia com a quantidade exata de elementos digitados.
        // entradas = Arrays.copyOf(entradas, tamanhoAtual);
        // System.out.println(Arrays.toString(entradas));

        // Lê um número arbitrário de valores do teclado (v2)
        final int TAMANHO_INICIAL = 2;
        double[] entradas = new double[TAMANHO_INICIAL];
        int tamanhoAtual = 0;
        while (in.hasNextDouble()) {
            // Duplica o tamanho do vetor entradas caso necessário.
            if (tamanhoAtual >= entradas.length) {
                entradas = Arrays.copyOf(entradas, 2 * entradas.length);
            }

            entradas[tamanhoAtual] = in.nextDouble();
            tamanhoAtual++;
        }
        System.out.println(tamanhoAtual + "-" + Arrays.toString(entradas));

        // Cria um novo vetor cópia com a quantidade exata de elementos digitados.
        entradas = Arrays.copyOf(entradas, tamanhoAtual);
        System.out.println(Arrays.toString(entradas));
    }
}
