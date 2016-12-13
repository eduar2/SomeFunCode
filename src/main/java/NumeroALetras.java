package main.java;

import java.text.DecimalFormat;

/**
 * Created by eduar2 on 12-12-16.
 */
public class NumeroALetras {
    private static final String[] Unidades = { "", "UN ", "DOS ", "TRES ",
            "CUATRO ", "CINCO ", "SEIS ", "SIETE ", "OCHO ", "NUEVE ", "DIEZ ",
            "ONCE ", "DOCE ", "TRECE ", "CATORCE ", "QUINCE ", "DIECISEIS",
            "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE" };

    private static final String[] Decenas = { "VENTI", "TREINTA ", "CUARENTA ",
            "CINCUENTA ", "SESENTA ", "SETENTA ", "OCHENTA ", "NOVENTA ",
            "CIEN " };

    private static final String[] Centenas = { "CIENTO ", "DOSCIENTOS ",
            "TRESCIENTOS ", "CUATROCIENTOS ", "QUINIENTOS ", "SEISCIENTOS ",
            "SETECIENTOS ", "OCHOCIENTOS ", "NOVECIENTOS " };

    public static String convertirNumeroALetras(int numero){
        String numeroTexto="";
        if (numero == 0) {//si el valor es cero
            numeroTexto = "CERO";
        }
        else if (numero > 999999){
            numeroTexto = textoMillones(numero + "");
        }
        else if (numero > 999){
            numeroTexto = textoMiles(numero + "");
        }
        else if (numero > 99){
            numeroTexto(numero + "");
        }
        else if (numero > 9){
            numeroTexto = textoDecenas(numero + "");
        }
        else {
            numeroTexto = textoUnidades(numero+ "");
        }

        return numeroTexto;
    }

    
}
