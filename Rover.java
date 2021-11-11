public class Rover {
    // Variáveis de Instância
    private int x;
    private int y;

    // Métodos Construtores
    public Rover()
    {
        x = 0;
        y = 0;
    }

    public Rover(int xInicial, int yInicial)
    {
        x = xInicial;
        y = yInicial;
    }

    // Interface Pública
    public void moverNorte()
    {
       y++;
    }

    public void moverSul()
    {
       y--;
    }

    public void moverLeste()
    {
       x++;
    }

    public void moverOeste()
    {
       x--;
    }

    public String getPosicao()
    {
       return "(" + x + "," + y + ")";
    }
}
