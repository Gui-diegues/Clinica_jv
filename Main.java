import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {

        int opcao = -1;

        while (opcao != 0) {

            Thread.sleep(1000);

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cancelar consulta");
            System.out.println("2 - Remarcar consulta");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Código da consulta: ");
                    int codigo = sc.nextInt();

                    if (codigo > 0) {
                        System.out.println("Consulta cancelada.");
                    } else {
                        System.out.println("Código inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Código da consulta: ");
                    int codigo2 = sc.nextInt();

                    if (codigo2 > 0) {
                        System.out.println("Consulta Remarcada.");
                    } else {
                        System.out.println("Código inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}