/**
 *
 * @author vand
 * Qual é o maior fator primo do numero 31758431803
 * recursivamente
 */
public class MaiorFator {
    
    public static void main(String[] args){
        long r = maior_fator_primo(31758431803l);
        System.out.println(r);
    }

    private static long maior_fator_primo(long a) {
        long r = a;
        
        for(long i=2; i< Math.sqrt(a); i++)
            if(a % i == 0){
                return maior_fator_primo(a/i);
            }
                return r;
    }
}
