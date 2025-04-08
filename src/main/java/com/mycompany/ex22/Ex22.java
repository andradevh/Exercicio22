package com.mycompany.ex22;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex22 {

    public static void main(String[] args) {
        double media, soma = 0, i = 1, limite = 1000;
        while( i <= limite){
            soma = soma+i;
            i++;
        }
        media =  soma / limite;
        DecimalFormat format = new DecimalFormat(" 0.0 ");
        JOptionPane.showMessageDialog(null,"Aritmetica: " + format.format(media));
    }
}