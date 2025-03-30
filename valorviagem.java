package DANIEL;

import java.util.Scanner;

public class valorviagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorViagem, valorPorAmigo;
        int numAmigos;

        System.out.println("Digite o valor total da viagem para Eurotrip: ");
        valorViagem = scanner.nextDouble();

        System.out.println( "Digite o número de amigos que irão viajar: ");
        numAmigos = scanner.nextInt();

        valorPorAmigo = valorViagem / numAmigos;

        System.out.println("\n Destino da Eurotrip: ");
        System.out.println("\n 1º Alemanha: ");
        System.out.println("\n 2º Portugal: ");
        System.out.println("\n 3º Itália: ");

        System.out.println("\n Valor total da Viagem R$: " + valorViagem);
        System.out.println("\n Número de amigos: " + numAmigos);
        System.out.println("\n Valor que cada amigo deverá pagar: " + valorPorAmigo);

        scanner.close();

    }
    
}
