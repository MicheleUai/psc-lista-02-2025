package DANIEL;

    import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicaçãoa: " + multiplicacao);

        input.close();


    }
    
}
