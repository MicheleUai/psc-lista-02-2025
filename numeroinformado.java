package DANIEL;

    import javax.swing.JOptionPane;

    public class numeroinformado {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog ("Digite um número:");

            int numero = Integer.parseInt(input);

            JOptionPane.showMessageDialog( null, "O número informado foi: " + numero);

    
        }
}
