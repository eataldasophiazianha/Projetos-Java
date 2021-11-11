/**
    Classe que simula uma caixa registrado simples. A caixa dispõe de um contador
    de itens e do valor total da compra.
*/
public class CaixaRegistradora {
    // Dados (atributos)
    private double precoTotal;
    private int qtdItens;

    // Interface Pública (métodos de instância)
    /**
        Método que adiciona um item a contagem da máquina.
        @param preco o preco do item a ser adicionado.
    */
    public void adicionaItem(double preco) {
        qtdItens++;
        precoTotal += preco;
    }

    /**
        Método que acessa o valor total da compra até o momento.
        @return o valor total da compra.
    */
    public double acessaTotal() {
        return precoTotal;
    }

    /**
        Método que acessa a quantidade de itens da compra até o momento.
        @return a quantidade de itens da compra.
    */
    public int acessaQtdItens() {
        return qtdItens;
    }
    
    /**
        Reinicializa o estado da máquina registradora.
    */
    public void limpa() {
        precoTotal = 0;
        qtdItens = 0;
    }
}
