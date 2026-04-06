import java.util.Scanner;

/**
 * Programa que calcula a idade com base no ano atual e ano de nascimento.
 */
public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println(nome + ", você tem " + idade + " anos de idade.");

        scanner.close();
    }
}
