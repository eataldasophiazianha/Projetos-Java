public class Matrizes {
    public static void main(String[] args) {
        String[][] matriz1 = new String[6][3];

        String[][] matriz2 = {
                                {"a", "b", "c", "d"},
                                {"e", "f", "g", "h"},
                                {"i", "j", "l", "m"},
                             };
        String str = matriz2[1][1];
        System.out.println(str);
        matriz2[1][1] = "k";
        //str = "k";  // Faz str referenciar uma nova String
        System.out.println(matriz2[1][1]);

        int[][] valores = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // Imprime a matriz.
        for (int i = 0; i < valores.length; i++){ // itera sobre as linhas
            for (int j = 0; j < valores[i].length; j++) { // itera sobre as colunas
                System.out.printf("%4d", valores[i][j]);
            }
            System.out.println();
        }

        // Itera sobre a coluna 2
        int total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i][2];
        }
        // total += valores[0][2];
        // total += valores[1][2];
        // total += valores[2][2];
        System.out.println(total);

        // Itero sobre a linha 2
        total = 0;
        for (int j = 0; j < valores.length; j++) {
            total += valores[2][j];
        }
        // total += valores[2][0];
        // total += valores[2][1];
        // total += valores[2][2];
        System.out.println(total);
    }
}
