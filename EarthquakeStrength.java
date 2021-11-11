import java.util.Scanner;

/**
   This program gives a description of an earthquake, given the Richter scale magnitude.
*/
public class EarthquakeStrength
{
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a magnitude on the Richter scale: ");
      double richter = in.nextDouble();

      // Print the description

      if (richter >= 8.0)
      {
         System.out.println("Most structures fall");
      }
      else if (richter >= 7.0)
      {
         System.out.println("Many buildings destroyed");
      }
      else if (richter >= 6.0)
      {
         System.out.println("Many buildings considerably damaged, some collapse");
      }
      else if (richter >= 4.5)
      {
         System.out.println("Damage to poorly constructed buildings");
      }
      else 
      {
         System.out.println("No destruction of buildings");
      }
   }
}

