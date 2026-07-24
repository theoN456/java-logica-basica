import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("--- Calculadora ---");
        try {

            while (opcao != 5) {
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");

                opcao = input.nextInt();

                System.out.println("Opeção escolhida: " + opcao);

                if (opcao >= 1 && opcao <= 4) {

                    System.out.print("Digite o primeiro número: ");
                    double primeiroNum = input.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double segundoNum = input.nextDouble();

                    ValoresNumericos numeroDigitado = new ValoresNumericos(primeiroNum, segundoNum);

                    switch (opcao) {

                        case 1:
                            System.out.println("Resultado da Soma: " + numeroDigitado.soma());
                            break;

                        case 2:
                            System.out.println("Resultado da Subtração: " + numeroDigitado.subtrair());
                            break;

                        case 3:
                            System.out.println("Resultado da Multiplicação: " + numeroDigitado.multiplicar());
                            break;

                        case 4:
                            System.out.println("Resultado da Divisão: " + numeroDigitado.dividir());
                            break;
                    }
                }

                else if (opcao == 5) {
                    System.out.println("Encerrando calculadora...");
                }

                else {
                    System.out.println("Opção inválida!");
                }
            }
        }

        catch (ArithmeticException zero) {
            System.out.println(zero.getMessage());
        }
        catch (IllegalArgumentException numero) {
            System.out.println(numero.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro: Apenas números!");
        }
        finally {
            input.close();
        }
    }
}
