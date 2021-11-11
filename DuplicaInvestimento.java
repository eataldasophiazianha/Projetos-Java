/**
    Este programa computa o tempo necessário para duplicar um investimento.
*/
public class DuplicaInvestimento
{
   public static void main(String[] args)
   {  
      final double TAXA = 5;
      final double BALANCO_INICIAL = 10000;
      final double META = 2 * BALANCO_INICIAL;
      
      double balanco = BALANCO_INICIAL;
      int ano = 0;

      // Conta o número de anos até que o rendimento duplique.

      while (balanco < META)
      {  
         ano++;
         double rendimento = balanco * TAXA / 100;
         balanco = balanco + rendimento;
      }
      
      System.out.println("O investimento duplicará após "
         + ano + " anos.");
   }
}
