/**
 *
 * @author vand
 * Faça um programa onde o mesmo calcule Combinação dados n e p digitados pelo usuario.
 * n / p!(n-p)!
 */

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class AnalCombinatoria {
    
    static int fatorial(int numero){
        int resultado = 1;
        while(numero > 0){
            resultado = resultado * numero;
            numero--;
            
        }
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int p = leitor.nextInt();
        int fatorialN = fatorial(n);
        int fatorialP = fatorial(p);
        int fatorialNP = fatorial(n - p);
        
        double resultado = (double)fatorialN / (fatorialP * fatorialNP);
        System.out.println(resultado);
    }
    

    
}
