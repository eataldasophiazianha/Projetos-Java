
/**
 * Write a description of class DriverContador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestaContador
{
    public static void main(String[] args)
    {
        Contador farmacia = new Contador();
        Contador acougue = new Contador();
        Contador padaria = new Contador();
        
        farmacia.conta();
        farmacia.conta();
        farmacia.conta();
        farmacia.conta();
        System.out.println("Acessos à farmácia: " + farmacia.acessaValor());
        
        
        acougue.conta();
        acougue.conta();
        System.out.println("Acessos ao açougue: " + acougue.acessaValor());
        
    }
}
