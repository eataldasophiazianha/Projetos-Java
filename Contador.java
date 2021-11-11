public class Contador
{
    private int valor;     // variável de instância
    
    public void conta()    // método para incrementar o contador
    {
        valor = valor + 1;
    }
    
    public int acessaValor() // método para ler o contador
    {
        return valor;
    }
}
