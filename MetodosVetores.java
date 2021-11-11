import java.util.Arrays;

public class MetodosVetores {
    public static void main(String[] args) {
        double[] vetor = {2, 3, 4, 5};
        double soma = somatorio(vetor);

        //System.out.println(Arrays.toString(vetor));
        //multiplica(vetor, 1.5);
        //System.out.println(Arrays.toString(vetor));

        int[] vetor2 = quadrados(10);
        System.out.println(Arrays.toString(vetor2));

    }

    public static double somatorio(double[] valores) {
        double total = 0;
        for (double valor : valores) {
            total = total + valor;
        }
        return total;
    }

    public static void multiplica(double[] valores, double fator) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = valores[i] * fator;
        }
    }

    public static int[] quadrados(int n){
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = i * i;
        }
        return resultado;
    }
}
