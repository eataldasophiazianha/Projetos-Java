import java.util.Scanner;

/**
   Este programa lê uma sequência de valores e os imprime, marcando o maior de todos.
*/
public class MaiorElementoEmUmVetor
{
   public static void main(String[] args)
   {
      final int TAMANHO = 100;
      double[] valores = new double[TAMANHO];
      int tamanhoAtual = 0;

      // Lê os valores

      System.out.println("Por favor, digite os valores, S para sair:");
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble() && tamanhoAtual < valores.length)
      {
         valores[tamanhoAtual] = in.nextDouble();
         tamanhoAtual++;
      }

      // Encontra o maior valor

      double maior = valores[0];
      for (int i = 1; i < tamanhoAtual; i++)
      {
         if (valores[i] > maior)
         {
            maior = valores[i];
         }
      }

      // Imprime todos os elementos do vetor

      for (int i = 0; i < tamanhoAtual; i++)
      {
         System.out.print(valores[i]);
         if (valores[i] == maior)
         {
            System.out.print(" <== maior valor");
         }
         System.out.println();
      }
   }
}
