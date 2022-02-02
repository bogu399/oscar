package com.oscar;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Q11 {
    
    public static void valores(double valor) {
        int[] cedulas = {100,50,20,10,5,2};
        double[] moedas = {1,0.5,0.25,0.1,0.01};
		
        System.out.println("Notas");
		for(int i = 0; i < cedulas.length; i++){
			if( valor >= cedulas[i] ){
				System.out.println( (int)valor/cedulas[i] + " notas de " + cedulas[i]);
                valor = valor % cedulas[i];
				BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                valor = bd.doubleValue();
			} else {
                System.out.println((int)valor/cedulas[i] + " notas de " + cedulas[i]);
            }
		}
        double valor2 = valor;
        System.out.println("Moedas");
        for(int i = 0; i < moedas.length; i++) {
            if(valor2 > moedas[i]) {
                double result = valor2/moedas[i];
                int value = (int) result;
                System.out.println(value + " moeda(s) de " + moedas[i]);
                valor2 %= moedas[i];
                BigDecimal bd = new BigDecimal(valor2).setScale(2, RoundingMode.HALF_EVEN);
                valor2 = bd.doubleValue();
            } else {
                double result = valor2/moedas[i];
                int value = (int) result;
                System.out.println(value + " notas de " + moedas[i]);
            }
        }
    }
        
}
