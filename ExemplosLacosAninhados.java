public class ExemplosLacosAninhados{
    public static void main(String[] args) {
        // O que cada um dos laços abaixo imprime?
        // Laço 1
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Laço 2
        // for (int i = 1; i <= 4; i++)
        // {
        //     for (int j = 1; j <= 3; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Laço 3
        // for (int i = 1; i <= 4; i++)
        // {
        //     for (int j = 1; j <= i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Laço 4
        // for (int i = 1; i <= 3; i++)
        // {
        //     for (int j = 1; j <= 5; j++)
        //     {
        //         if (j % 2 == 0)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print("-");
        //         }
        //     }
        //     System.out.println();
        // }


        // Laço 5
        // for (int i = 1; i <= 3; i++)
        // {
        //     for (int j = 1; j <= 5; j++)
        //     {
        //         if (i % 2 == j % 2)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
