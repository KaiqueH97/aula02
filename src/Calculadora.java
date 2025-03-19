import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        String operacao;
        double num1, num2, res = 0;

        try (Scanner scan = new Scanner(System.in)) { // Entrada de dados no Terminal em JAVA

            // Exibição das opções de operação
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Digite a operação: ");
            operacao = scan.next();

            // Entrada dos números
            System.out.print("Digite o primeiro numero:");
            num1 = scan.nextDouble();

            System.out.print("Digite o segundo numero:");
            num2 = scan.nextDouble();

            // Função equals é utilizada para comparar se o texto é igual
            if (operacao.equals("1")) {
                res = adicao(num1, num2);
            } else if (operacao.equals("2")) {
                res = subtracao(num1, num2);
            } else if (operacao.equals("3")) {
                res = multiplicacao(num1, num2);
            } else if (operacao.equals("4")) {
                res = divisao(num1, num2);
            } else {
                System.out.println("Operação Inválida");
            }

            // Exibição do resultado
            System.out.println("O Resultado: " + res);
        }
    }

    // Funções para realizar as operações
    public static double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public static double divisao(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Erro: Não é permitido dividir por zero");
            System.exit(0);
        }
        return n1 / n2;
    }
}
