public class Potencia
{
    public static void main(String[] args)
    {
        final int NMAX = 6;
        final int XMAX = 15;

        // Imprime o cabeçalho
        for(int n = 1; n <= NMAX; n++)
        {
            System.out.printf("%10d", n);
        }

        // Imprime uma quebra de linha
        System.out.println();

        for(int n = 1; n <= NMAX; n++)
        {
            System.out.printf("%10s", "x ");
        }
        // Imprime uma quebra de linha
        System.out.println();

        // Imprime o corpo da tabela
        for(int x = 1; x <= XMAX; x++)
        {
            // Imprime uma linha
            for(int n = 1; n <= NMAX; n++)
            {
                System.out.printf("%10.0f", Math.pow(x, n));
            }

            // Imprime uma quebra de linha
            System.out.println();
        }
    }
}
