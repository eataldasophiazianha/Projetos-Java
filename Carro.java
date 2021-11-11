
/**
    Classe que descreve o comportamento de um carro que tem um tanque de combustível
    e uma eficiência de consumo de combustível associados.
*/
public class Carro {
    // Dados (atributos)
    private double eficiencia;
    private double litrosDeCombustivel;

    // Interface Pública
    /**
        Constrói um objeto carro com uma eficiência em km/l passada como parâmatro
        e um tanque vazio.
        @param kmsPorLitro A eficiência do carro.
    */
    public Carro(double kmsPorLitro) {
        eficiencia = kmsPorLitro;
        litrosDeCombustivel = 0.0;
    }

    /**
        Simula o uso do carro por uma distância em quilômetros.
        @param distancia A distância pela qual o carro será dirigido.
    */
    public void dirigir(double distancia) {
        double consumo = distancia / eficiencia;
        // if (consumo >= litrosDeCombustivel) {
        //     litrosDeCombustivel = 0.0;
        // }
        // else {
        //     litrosDeCombustivel -= consumo;
        // }
        litrosDeCombustivel = (consumo >= litrosDeCombustivel) ? 0.0 : litrosDeCombustivel - consumo;
    }

    /**
        Acessa e devolve a quantidade de combustível no tanque.
        @return a quantidade de litros de combustível no tanque.
    */
    public double acessaNivelCombustivel() {
        return litrosDeCombustivel;
    }

    /**
        Adiciona combustível ao tanque do veículo.
        @param litros a quantidade de litros a ser adicionada.
    */
    public void adicionaCombustivel(double litros) {
        litrosDeCombustivel += litros;
    }
}
