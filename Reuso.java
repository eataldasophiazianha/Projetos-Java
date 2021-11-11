import java.util.Scanner;

public class Reuso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horas = leHoras();
        int minutos = leAte(59);
        int mes = leEntre(1, 12);
    }

    public static int leHoras() {
        Scanner in = new Scanner(System.in);

        int entrada;
        do {
            System.out.print("Entre com um valor entre 0 e 23: ");
            entrada = in.nextInt();
        } while (entrada < 0 || entrada > 23);
        return entrada;
    }

    /**
        Solicita um número inteiro ao usuário até o limiteSuperior que é passado
        como argumento.
        @param limiteSuperior define o maior valor que pode ser lido (inclusive)
        @return o valor digitado pelo usuário (entre 0 e limiteSuperior)
    */
    public static int leAte(int limiteSuperior) {
        Scanner in = new Scanner(System.in);

        int entrada;
        do {
            System.out.print("Entre com um valor entre 0 e " + limiteSuperior + ": ");
            entrada = in.nextInt();
        } while (entrada < 0 || entrada > limiteSuperior);
        return entrada;
    }

    /**
        Solicita um número inteiro n tal que  limiteInferior <= n <= limiteSuperior
        @param limiteSuperior define o maior valor que pode ser lido (inclusive)
        @param limiteInferior define o menor valor que pode ser lido (inclusive)
        @return o valor digitado pelo usuário (entre limiteInferior e limiteSuperior)
    */
    public static int leEntre(int limiteInferior, int limiteSuperior) {
        Scanner in = new Scanner(System.in);

        int entrada;
        do {
            System.out.print("Entre com um valor entre " + limiteInferior + " e " + limiteSuperior + ": ");
            entrada = in.nextInt();
        } while (entrada < limiteInferior || entrada > limiteSuperior);
        return entrada;
    }

}
