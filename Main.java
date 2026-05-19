import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> pacientes = new ArrayList<>();
    static ArrayList<String> profissionais = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        int opcao = -1;

        while (opcao != 0) {

            Thread.sleep(1000);

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - Cadastrar profissional");
            System.out.println("3 - Agendar consulta");
            System.out.println("4 - Registrar atendimento");
            System.out.println("5 - Cancelar consulta");
            System.out.println("6 - Remarcar consulta");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do paciente: ");
                    String novoPaciente = sc.nextLine();

                    pacientes.add(novoPaciente);

                    System.out.println("Paciente cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.print("Nome do profissional: ");
                    String novoProfissional = sc.nextLine();

                    profissionais.add(novoProfissional);

                    System.out.println("Profissional cadastrado com sucesso!");

                    break;

                case 3:

                    System.out.print("Nome do paciente: ");
                    String paciente = sc.nextLine();

                    System.out.print("Nome do profissional: ");
                    String profissional = sc.nextLine();

                    System.out.print("Data da consulta: ");
                    String data = sc.nextLine();

                    System.out.print("Horário da consulta: ");
                    String horario = sc.nextLine();

                    System.out.println("\nConsulta agendada com sucesso!");
                    System.out.println("Paciente: " + paciente);
                    System.out.println("Profissional: " + profissional);
                    System.out.println("Data: " + data);
                    System.out.println("Horário: " + horario);

                    break;

                case 4:

                    System.out.print("Nome do paciente: ");
                    String pacienteAtendimento = sc.nextLine();

                    System.out.print("Descrição do atendimento: ");
                    String atendimento = sc.nextLine();

                    System.out.println("\nAtendimento registrado com sucesso!");
                    System.out.println("Paciente: " + pacienteAtendimento);
                    System.out.println("Descrição: " + atendimento);

                    break;

                case 5:

                    System.out.print("Código da consulta: ");
                    int codigo = sc.nextInt();

                    if (codigo > 0) {
                        System.out.println("Consulta cancelada.");
                    } else {
                        System.out.println("Código inválido.");
                    }

                    break;

                case 6:

                    System.out.print("Código da consulta: ");
                    int codigo2 = sc.nextInt();

                    if (codigo2 > 0) {
                        System.out.println("Consulta remarcada.");
                    } else {
                        System.out.println("Código inválido.");
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
