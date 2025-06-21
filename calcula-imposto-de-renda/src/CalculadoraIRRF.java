import java.util.Scanner;

public class CalculadoraIRRF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário bruto mensal: R$ ");
        double salario = scanner.nextDouble();

        double impostoBruto = 0;
        double deducao = 0;
        double impostoFinal = 0;
        String faixa = "";

        // Cálculo do IRRF com base na tabela (valores aproximados de 2024)
        if (salario <= 2259.20) {
            System.out.println("\n" + nome + ", você está isento do imposto de renda.");
        } else if (salario <= 2826.65) {
            impostoBruto = salario * 0.075;
            deducao = 169.44;
            impostoFinal = impostoBruto - deducao;
            faixa = "7,5%";
        } else if (salario <= 3751.05) {
            impostoBruto = salario * 0.15;
            deducao = 381.44;
            impostoFinal = impostoBruto - deducao;
            faixa = "15%";
        } else if (salario <= 4664.68) {
            impostoBruto = salario * 0.225;
            deducao = 662.77;
            impostoFinal = impostoBruto - deducao;
            faixa = "22,5%";
        } else {
            impostoBruto = salario * 0.275;
            deducao = 896.00;
            impostoFinal = impostoBruto - deducao;
            faixa = "27,5%";
        }

        // Exibição dos resultados
        if (salario > 2259.20) {
            System.out.println("\n--- Detalhamento do Cálculo ---");
            System.out.println("Nome: " + nome);
            System.out.printf("Salário Bruto: R$ %.2f\n", salario);
            System.out.println("Faixa de Alíquota: " + faixa);
            System.out.printf("Imposto Bruto (%.1s): R$ %.2f\n", faixa, impostoBruto);
            System.out.printf("Dedução fixa aplicada: R$ %.2f\n", deducao);
            System.out.printf("Imposto de Renda a pagar: R$ %.2f\n", impostoFinal);
        }

        // Mensagem final
        System.out.println("\nAgradecemos por utilizar o nosso serviço!");

        scanner.close();
    }
}
