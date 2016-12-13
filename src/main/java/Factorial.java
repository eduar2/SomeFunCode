package main.java;

import javafx.util.converter.BigIntegerStringConverter;

import java.math.BigInteger;

/**
 * Created by eduar2 on 12-12-16.
 */
public class Factorial {


    public static BigInteger calcularFactorial(int i) {
        return (i <=1) ? BigInteger.valueOf(1): calcularFactorial(i-1).multiply(BigInteger.valueOf(i));
    }

    //se ap
    public int contarCerosFactorial(int i){
        BigInteger factorial = calcularFactorial(i);
        String numero = factorial.toString();
        int valor = this.contarCerosCadena(numero);
        return valor;
    }

    private int contarCerosCadena(String cadena){
        int i ;
        i = (!cadena.substring(cadena.length()-1).equals("0") ?0: 1 + contarCerosCadena(cadena.substring(0,cadena.length()-1)));
        return i;
    }

}
