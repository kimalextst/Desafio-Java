import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        menu();
    }

    static String nome = "";
    static String profissao = "";
    static double salarios[] = new double[12];
    static double salarioComImposto[] = new double[12];
    static double imposto[] = new double[12];

    public static void menu() {
        Scanner leitorMenu = new Scanner(System.in);

        System.out.println("\n-----MENU-----");
        System.out.println("\n1 - Cadastrar habitante (nome e profissão)");
        System.out.println("2 - Mostrar informações cadastradas de um habitante (nome e profissão)");
        System.out.println("3 - Cadastrar salarios");
        System.out.println("4 - Mostrar salarios cadastrados");
        System.out.println("5 - Calcular e mostrar imposto");
        System.out.println("6 - Mostrar informações gerais de um habitante");
        System.out.println("7 - Sair");
        System.out.println("\n-------------------\n");
        System.out.print("");
        int opcaoDesejada = leitorMenu.nextInt();
        
        if (opcaoDesejada == 1) {
            cadastroHabitante();
        } else if (opcaoDesejada == 2) {
            mostrarCadastro(nome, profissao);
        } else if (opcaoDesejada == 3) {
            cadastrarSalarios();
        } else if (opcaoDesejada == 4) {
            mostrarSalarios();
        } else if (opcaoDesejada == 5) {
            calcularImposto();
        } else if (opcaoDesejada == 6) {
            mostrarInformacoesGerais();
        } else {
            System.exit(0);
        }

        System.out.println("\n-----OPÇÕES-----");
        System.out.println("\n1 - Voltar pro menu");
        System.out.println("2 - Sair\n");
        System.out.println("\n-------------------\n");
        System.out.print("");
        int opcao = leitorMenu.nextInt();

            if (opcao == 1) {
                menu();
            } else {
                System.exit(0);
            }
    }


    private static void cadastroHabitante() {
        Scanner leitorMenu = new Scanner(System.in);
        
        nome = cadastrarHabitanteNome();
        profissao = cadastroHabitanteProfissao();
    }
    
    public static String cadastrarHabitanteNome() {
        Scanner cadastro = new Scanner(System.in);

        System.out.println("\n-----CADASTRO-----");
        System.out.println("\nInsira o nome do habitante\n");
        String nome = cadastro.nextLine();

        return nome;
    }

    private static String cadastroHabitanteProfissao() {
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("\n-------------------");
        System.out.println("\nInsira a profissão do habitante\n");
        String profissao = cadastro.nextLine();

        return profissao;
    }

    public static void mostrarCadastro(String nome, String profissao) {
        System.out.println("\n-----HABITANTE-----");
            System.out.println("\nNome: "+nome);
            System.out.println("Profissão: "+profissao);
        }

    public static void cadastrarSalarios() {
        Scanner leitorSalarios = new Scanner(System.in);

        System.out.println("\n-----SALARIOS-----\n");
        for (int i = 0; i < 12; i++){
            int numero = i + 1;
            System.out.print("Digite o valor do salario no "+numero+"° mês (Formato: R$1500,00): R$");
            salarios[i] = leitorSalarios.nextDouble();
        }
    }

    public static void mostrarSalarios() {
        System.out.println("\n-----SALARIOS-----\n");
        System.out.println("Janeiro: R$"+salarios[0]);
        System.out.println("Fevereiro: R$"+salarios[1]);
        System.out.println("Março: R$"+salarios[2]);
        System.out.println("Abril: R$"+salarios[3]);
        System.out.println("Maio: R$"+salarios[4]);
        System.out.println("Junho: R$"+salarios[5]);
        System.out.println("Julho: R$"+salarios[6]);
        System.out.println("Agosto: R$"+salarios[7]);
        System.out.println("Setembro: R$"+salarios[8]);
        System.out.println("Outubro: R$"+salarios[9]);
        System.out.println("Novembro: R$"+salarios[10]);
        System.out.println("Dezembro: R$"+salarios[11]);
    }

    public static void calcularImposto() {
        Scanner leitorImposto = new Scanner(System.in);

        System.out.println("\n-----IMPOSTO-----\n");
        for (int i = 0; i < 12; i++){
            if (salarios[i] <= 2000.00){
                salarioComImposto[i] = salarios[i];
            } else if (salarios[i] >= 2001.00 && salarios[i] <= 3000.00){
                salarioComImposto[i] = salarios[i] - (salarios[i] * 0.08);
            } else if (salarios[i] <= 3001.00 && salarios[i] <= 4500.00){
                salarioComImposto[i] = salarios[i] - (salarios[i] * 0.18);
            } else {
                salarioComImposto[i] = salarios[i] - (salarios[i] * 0.28);
            }

            imposto[i] = salarios[i] - salarioComImposto[i];

            int numero = i + 1;

            System.out.println("Imposto do "+numero+"° mês do ano");
            System.out.printf("\n R$%.2f",imposto[i]);
            System.out.println("\n\n-------------------\n");
        }
    }

    public static void mostrarInformacoesGerais() {
        Scanner leitorGeral = new Scanner(System.in);
        
        mostrarCadastro(nome, profissao);
        mostrarSalarios();
        calcularImposto();
    }
}

