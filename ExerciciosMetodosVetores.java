import java.util.Arrays;

public class ExerciciosMetodosVetores {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4};

        boolean achou = pertence(vetor, 5);
        if (achou) {
            System.out.println("O elemento foi encontrado.");
        }
        else {
            System.out.println("O elemento não foi encontrado.");
        }

        double[] v1 = {1,2,3,4};
        double[] v2 = {1,2,3,4};
        double[] v3 = {2,1,3,4};
        double[] v4 = {1,2,3,4,5};

        System.out.println(iguais(v1, v2));
        System.out.println(iguais(v1, v3));
        System.out.println(iguais(v1, v4));
        System.out.println(iguais(v1, v1));
        System.out.println();

        System.out.println("Testando a solução do exercício 4...");
        double[] v5 = {1,2,3,4};
        double[] v6 = {4,3,2,1};
        double[] v7 = {4,-2};
        double[] v8 = {1,1,1,1};
        System.out.println("Resultado: " + mesmaMedia(v5, v6) + " Valor esperado: " + true);
        System.out.println("Resultado: " + mesmaMedia(v5, v7) + " Valor esperado: " + false);
        System.out.println("Resultado: " + mesmaMedia(v7, v8) + " Valor esperado: " + true);
        System.out.println();


        System.out.println("Testando a solução do exercício 5...");
        int[][] identidade = diagonal(10);
        imprimeMatrizInt(identidade);
        System.out.println();

        System.out.println("Testando a solução do exercício 6...");
        int[][] alt = alternada(5);
        imprimeMatrizInt(alt);
        System.out.println();

        System.out.println("Testando a solução do exercício 7...");
        System.out.println(Arrays.toString(reverso(v4)));
        System.out.println();

        System.out.println("Testando a solução do exercício 8...");
        exercicio8();
    }

    public static boolean pertence(int[] vetor, int alvo) {
        for (int valor : vetor) {
            if (valor == alvo) {
                return true;    // Sai imediatamente da chamada na primeira ocorrência de alvo em vetor
            }
        }
        return false;
    }

    public static boolean mesmoTamanho(double[] vetor1, double[] vetor2) {
        // O operador relacional retorna true quando os dois vetores tem o mesmo tamanho.
        return vetor1.length == vetor2.length;
    }

    public static boolean iguais(double[] vetor1, double[] vetor2) {
        // Inicialmente é feito o teste se os dois vetores possuem o mesmo tamanho.
        if (!mesmoTamanho(vetor1, vetor2)) {
            return false; // Sai imediatamente da chamada devolvendo o valor false
        }
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                return false;   // Sai imediatamente da chamada devolvendo o valor false
            }
        }
        return true;
    }

    public static double somatorio(double[] vetor) {
        double total = 0;
        for (double e : vetor) {
            total = total + e;
        }
        return total;
    }

    public static boolean mesmaMedia(double[] vetor1, double[] vetor2) {
        final double EPSILON = 1E-14;

        double totalVetor1 = somatorio(vetor1);
        double totalVetor2 = somatorio(vetor2);

        double media1 = (vetor1.length == 0) ? 0.0 : totalVetor1 / vetor1.length;
        double media2 = (vetor2.length == 0) ? 0.0 : totalVetor2 / vetor2.length;

        if (Math.abs(media1 - media2) < EPSILON) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void imprimeMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%8d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] diagonal(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1;
        }

        return matriz;
    }

    public static int[][] alternada(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 != 0) {
                    matriz[i][j] = 1;
                }
            }
        }

        return matriz;
    }

    public static double[] reverso(double[] vetor) {
        double[] vetorReverso = new double[vetor.length];

        // versão com duas variáveis de controle
        // for (int i = vetor.length - 1, j = 0; i >= 0; i--, j++) {
        //         vetorReverso[j] = vetor[i];
        // }

        for (int i = vetor.length - 1; i >= 0; i--) {
                vetorReverso[(vetor.length - 1) - i] = vetor[i];
        }
        return vetorReverso;
    }

    public static void exercicio8() {
        final int QTD_NUMEROS = 20;
        int[] vetor = new int[QTD_NUMEROS];

        for (int i = 0; i < QTD_NUMEROS; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(vetor));

        Arrays.sort(vetor);

        System.out.println(Arrays.toString(vetor));
    }
}
