import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
    try (Scanner dataInfo = new Scanner(System.in)) {
        System.out.println("Informe um número inteiro!");
        int numberInt = dataInfo.nextInt();

        System.out.println("Você informou o número: " + numberInt);

        dataInfo.close();
    }
}
}
