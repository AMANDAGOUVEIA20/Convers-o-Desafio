package br.com;

import java.util.Scanner;

public class DesafioConversao{
    public static void main(String[] args) {

        Scanner play = new Scanner(System.in);

        System.out.println("Digite o valor:" );
        String valor1 = play.next().replace(",",".");

        System.out.println("Digite o segundo valor: " );
        String valor2 = play.next().replace(",",".");

        System.out.println("Digite o terceiro valor: " );
        String valor3 = play.next().replace(",",".");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média é:" + media);

        play.close();
    }
}
