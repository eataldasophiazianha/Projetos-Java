/**
    Classe que simula o cálculo de notas de um estudante.
*/
public class Estudante {
    // Dados
    private String nome;
    private double notaTotal;
    private int qtdNotas;

    // Interface Pública
    /**
        Método construtor da classe Estudante. O nome deve ser passado como
        argumento. A nota total é inicializada em 0 e a quantidade de notas também.
        @param nomeDoAluno o nome do estudante a ser construído.
    */
    public Estudante (String nomeDoAluno) {
        nome = nomeDoAluno;
        notaTotal = 0.0;
        qtdNotas = 0;
    }

    /**
        Método de acesso ao nome do estudante.
        @return nome do estudante.
    */
    public String acessaNome () {
        return nome;
    }

    /**
        Modifica as notas parciais do estudante ao adicionar uma nota nova.
        @param notaParcial a nota parcial a ser adicionada.
    */
    public void adicionaNota(int notaParcial) {
        notaTotal += notaParcial;
        qtdNotas++;
    }

    /**
        Acessa a notal total atual do estudante.
        @return a nota total atual.
    */
    public double acessaNotaTotal() {
        return notaTotal;
    }

    /**
        Acessa a nota media atual do estudante. O método verifica uma eventual
        divisão por 0.
        @return a nota média atual do estudante
    */
    public double acessaNotaMedia() {
        double notaMedia;
        if (qtdNotas == 0) {
            notaMedia = 0;
        }
        else {
            notaMedia = notaTotal / qtdNotas;
        }

        return notaMedia;
    }
}
