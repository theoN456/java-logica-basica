import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Calculadora ---");

        try {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int opcao = input.nextInt();

            System.out.println("Operação escolhida: " + opcao);

            if (opcao > 4 || opcao <= 0){
                throw new IllegalArgumentException("Operação não existe, escolha outro!");
            }

            System.out.println("Digite o primeiro número: ");
            double n1 = input.nextDouble();

            System.out.println("Digite o segundo número: ");
            double n2 = input.nextDouble();

            OperacoesNumericas result = new OperacoesNumericas(n1, n2);

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + result.soma());
                    break;

                case 2:
                    System.out.println("Resultado da Subtração: " + result.subtrair());
                    break;

                case 3:
                    System.out.println("Resultado da multiplicação: " + result.multiplicar());
                    break;

                case 4:
                    System.out.println("Resultado da divição: " + result.dividir());
                    break;
            }
        }
        catch (IllegalArgumentException OperacaoNaoExiste) {
            System.out.println(OperacaoNaoExiste.getMessage());
        }
        catch (ArithmeticException valorNaoDivisivel) {
            System.out.println(valorNaoDivisivel.getMessage());
        }
        catch (Exception e) {
            System.out.println("Apenas números, refaça de novo!");
        }
    }
}
