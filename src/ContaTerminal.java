import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
    Scanner idInfo = new Scanner(System.in);
        System.out.println("Informe número do seu ID!");
        String id = idInfo.next();

    Scanner agencyInfo = new Scanner(System.in);
        System.out.println("Informe sua Agência!");
        int agency = agencyInfo.nextInt();

    Scanner nameInfo = new Scanner(System.in);
        System.out.println("Informe seu Nome!");
        String name = nameInfo.nextLine();

    Scanner balanceInfo = new Scanner(System.in);
        System.out.println("Informe seu Saldo!");
        Double balance = balanceInfo.nextDouble();
        

        System.out.printf("%s obrigado por criar uma conta em nosso banco, sua agência é: %s, sua conta é: %s e seu saldo é %.2f e está disponível para saque!", name,agency,id,balance);

        idInfo.close();
        agencyInfo.close();
        nameInfo.close();
        balanceInfo.close();

}
}
