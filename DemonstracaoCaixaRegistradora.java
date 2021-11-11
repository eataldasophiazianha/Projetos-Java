public class DemonstracaoCaixaRegistradora {
    public static void main(String[] args) {
        CaixaRegistradora cr = new CaixaRegistradora();
        cr.limpa();
        cr.adicionaItem(4.5);
        cr.adicionaItem(5.5);
        cr.adicionaItem(0.5);
        System.out.println(cr.acessaTotal() + " " + cr.acessaQtdItens());
    }
}
