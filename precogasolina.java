package DANIEL;

import java.util.Scanner;

public class precogasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = input.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = input.nextDouble();

        double valorTotal = precoLitro * litrosVendidos;

        System.out.println( "Valor a pagar: R$ " + valorTotal);

        input.close();
    }
    
}
