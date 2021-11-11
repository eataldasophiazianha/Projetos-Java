/** 
    Programa que determina se um número é um número Armstrong.
*/
public class Armstrong 
{
    /**
        Método que computa a ordem de um número inteiro (ou seja, o número de digitos).    
        @param n o número inteiro de entada.
        @return a ordem do número.
    */
    public static int ordem(int n) 
    { 
        int x = 0; 
        while (n != 0) 
        { 
            x++; 
            n = n/10; 
        } 
        return x; 
    } 
  
    /** 
        Método que determina se um número é um número Armstrong.
        @param n o número a ser testado.
        @return um valor booleano indicando se um número é um número de Armstrong.
    */
    public static boolean ehArmstrong (int n) 
    { 
        // Reusa o métod de ordem
        int o = ordem(n); 
        int temp = n;
        int soma=0; 
        while (temp != 0) 
        { 
            int r = temp % 10; 
            soma = soma + (int) Math.pow(r,o);  // Converte o retorno do método pow
            temp = temp / 10; 
        } 
        
        // retorna o booleano resultante do teste de igualdade
        return (soma == n); 
    } 
  
    // Método main com alguns testes.
    public static void main(String[] args) 
    { 
        int x = 153; // 153 é um número de Armstrong
        System.out.println(ehArmstrong(x)); 
        x = 1253;   // 1253 não é um número de Armstrong
        System.out.println(ehArmstrong(x)); 
    } 
}