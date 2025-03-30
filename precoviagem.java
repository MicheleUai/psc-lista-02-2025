package DANIEL;

import java.util.Scanner;

public class precoviagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoAlemanha, precoPortugal, precoItalia;
        int pessoasAlemanha, pessoasPortugal,pessoasItalia;
        double valorTotal;

        System.out.println("Digite o preço da viagem para Alemanha: ");
        precoAlemanha = scanner.nextDouble();
        System.out.println(" Digite a quantidade de pessoas que irão para a Alemanha: ");
        pessoasAlemanha = scanner.nextInt();

        
        System.out.println("Digite o preço da viagem para Portugal: ");
        precoPortugal = scanner.nextDouble();
        System.out.println(" Digite a quantidade de pessoas que irão para a Portugal: ");
        pessoasPortugal = scanner.nextInt();

        
        System.out.println("Digite o preço da viagem para Itália: ");
        precoItalia = scanner.nextDouble();
        System.out.println(" Digite a quantidade de pessoas que irão para a Itália: ");
        pessoasItalia = scanner.nextInt();

        valorTotal = (precoAlemanha * pessoasAlemanha) + (precoPortugal * pessoasPortugal) + (precoItalia * pessoasItalia);

        System.out.println("\n O valor total da viagem somando todos os destinos e pessoas é: R$ " + valorTotal);

        scanner.close();
    }
    
}
