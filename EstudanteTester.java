public class EstudanteTester {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Frodo");
        e1.adicionaNota(5);
        e1.adicionaNota(9);
        e1.adicionaNota(7);
        e1.adicionaNota(8);
        // e1.Estudante("Sam"); Erro
        e1 = new Estudante("Sam");
        System.out.println("O estudante " + e1.acessaNome() + " teve nota total " + e1.acessaNotaTotal() + " e nota média " + e1.acessaNotaMedia()); // imprime na tela "O estudante Frodo teve nota total 29 e nota média 7,25."
    }
}
