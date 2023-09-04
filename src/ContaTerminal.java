import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome = args [0];
        String agencia = args [4];
        int numerodaConta = Integer.valueOf(args[2]); 
        double saldo = Double.valueOf(args[3]);

        System.out.println("Por favor, digite o número da Agência !"+agencia);
        sc.nextLine();
        System.out.println("Olá "+nome+ "obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ "conta" +numerodaConta+ "e seu saldo "+saldo+ "já está disponível para saque");
        sc.nextLine();
        sc.close();
    }
}
