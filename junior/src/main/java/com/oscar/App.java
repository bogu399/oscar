package com.oscar;

import java.net.ContentHandler;
import java.util.Locale;
import java.util.Scanner;
import com.oscar.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        /**
         * QUESTÃO 1.1
         * @author Paulo Alessander
         */

        /*
        keyboard.useLocale(Locale.US);
        System.out.print("Coloque um número: ");
        double valor = keyboard.nextDouble();
        Q11.valores(valor); */
    	
        /**
         * QUESTÃO 1.2
         * @author Paulo Alessander
         */

        /* System.out.print("Coloque um número: ");
        int valor = keyboard.nextInt();
        System.out.println("Fatorial de " + valor + " é " + Q12.factorial(valor)); */ 

        /**
         * QUESTÃO 1.3
         * @author Paulo Alessander
         */
        
        /* boolean formaPagamentoCartaoProprio = false;
        boolean formaPagamentoOutrosCartoes = false;
        boolean cancelarVenda = false;
        boolean isConfirmarVenda = false;
        boolean vendaExterna = false;
        boolean nfce = false;
        if (
            ((formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio) && !(cancelarVenda &&
            isConfirmarVenda && vendaExterna))
            || (paramUtilizaTEF.getValorString().equals(Constantes.NAO) && !(cancelarVenda &&
            isConfirmarVenda && vendaExterna))
            || (formaPagamentoOutrosCartoes && vendaExterna && !cancelarVenda)
            || (nfce && formaPagamentoOutrosCartoes)
        ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        } */
    }
}
