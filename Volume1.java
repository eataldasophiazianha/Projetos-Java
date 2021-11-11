/**
   Este programa calcula o volume (em litros) de um pack de seis latinhas
   de refrigerante e o volutme total de um pack e de uma garrafa de dois litros.
*/
public class Volume1
{
   public static void main(String[] args)
   {
     int latasPorPack = 6;
     final double VOLUME_LATA = 0.355; // litros em uma latinha
     double volumeTotal = latasPorPack * VOLUME_LATA;

     System.out.print("Um pack de seis latinhas contém ");
     System.out.print(volumeTotal);
     System.out.println(" litros.");

     final double VOLUME_GARRAFA = 2; // Garrafa de dois litros

     volumeTotal = volumeTotal + VOLUME_GARRAFA;

     System.out.print("Um pack de seis latinhas e uma garrafa contém ");
     System.out.print(volumeTotal);
     System.out.println(" litros.");
   }
}
