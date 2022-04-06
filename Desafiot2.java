import java.util.Scanner;

public class Desafiot2 {
    public static void main(String[] args) {
        introducao();
        menuPrincipal();
    }

    public static void introducao() {
        Scanner leitorUser = new Scanner(System.in);
        
        System.out.println("Olá, bem-vinde. Qual o seu nome? \n");
        String nome = leitorUser.nextLine();
        System.out.println("\nOlá, "+nome+". Vou te encaminhar para o menu\n");
    }

    public static void menuPrincipal() {
        Scanner leitorMenuPrincipal = new Scanner(System.in);

        System.out.println("\n---------MENU---------");
        System.out.println("\n1 - Dados do Habitante");
        System.out.println("2 - Salarios e Impostos");
        System.out.println("3 - Sair");
        System.out.println("\n-------------------\n");
        System.out.print("");
        int opcaoDesejada = leitorMenuPrincipal.nextInt();

        if (opcaoDesejada == 1) {
            menuDados();
        } else if (opcaoDesejada == 2) {
            menuSalariosEImpostos();
        } else {
            System.exit(0);
        }
    }

    public static void menuDados() {
        Scanner leitorMenuDados = new Scanner(System.in);
        Scanner leitorDados = new Scanner(System.in);

        System.out.println("\n-----MENU DADOS-----");
        System.out.println("\n1 - Cadastrar Usuário");
        System.out.println("2 - Voltar para o menu principal");
        System.out.println("3 - Sair\n");
        System.out.println("\n-------------------\n");
        System.out.print("");
        int opcaoDesejada = leitorMenuDados.nextInt();

        if (opcaoDesejada == 1) {
                System.out.println("\n-----CADASTRO-----");
                System.out.println("\nInsira o nome do habitante\n");
                String nome = leitorDados.nextLine();
                System.out.println("\n-------------------");
                System.out.println("\nInsira a profissão do habitante\n");
                String profissao = leitorDados.nextLine();

                System.out.println("\n-------OPÇÕES-------");
                System.out.println("\n1 - Visualizar dados cadastrados");
                System.out.println("2 - Voltar para o menu principal");
                System.out.println("3 - Sair\n");
                System.out.println("\n-------------------\n");
                System.out.print("");
                int opcao = leitorMenuDados.nextInt();

                        if (opcao == 1) {
                            System.out.println("Nome: "+nome);
                            System.out.println("Profissão: "+profissao);

                            System.out.println("\n-------OPÇÕES-------\n");
                            System.out.println("1 - Voltar para o menu de dados");
                            System.out.println("2 - Voltar para o menu principal");
                            System.out.println("3 - Sair\n");
                            System.out.println("\n-------------------\n");
                            System.out.print("");
                            int opcao2 = leitorMenuDados.nextInt();

                                    if (opcao2 == 1) {
                                        menuDados();
                                    } else if (opcao2 == 2){
                                        menuPrincipal();
                                    } else{
                                        System.exit(0);
                                    }
                        } else if (opcao == 2) {
                            menuPrincipal();
                        } else {
                            System.exit(0);
                        }
                        
        } else if (opcaoDesejada == 2) {
           menuPrincipal(); 
        } else {
            System.exit(0);
        }
    }

    public static void menuSalariosEImpostos() {
        Scanner leitorMenuSalariosEImpostos = new Scanner(System.in);
        Scanner leitorSalarios = new Scanner(System.in);
        double[] salarios = new double[12];
        double[] salarioComImposto = new double[12];
        double[] imposto = new double[12];

        System.out.println("\n--SALARIOS E IMPOSTOS--");
        System.out.println("\n1 - Cadastrar Salarios");
        System.out.println("2 - Voltar para o menu principal");
        System.out.println("3 - Sair\n");
        System.out.println("\n-------------------\n");
        System.out.print("");
        int opcaoDesejada = leitorMenuSalariosEImpostos.nextInt();

        if (opcaoDesejada == 1) {
            System.out.println("\n-----SALARIOS-----\n");
            
            for (int i = 0; i < 12; i++){
            System.out.print("Digite o valor do salario no "+ (i + 1) +"° mês (Formato: R$1500,00): R$");
            salarios[i] = leitorSalarios.nextDouble();
            } 

            System.out.println("\n-------OPÇÕES-------\n");
            System.out.println("1 - Visualisar salarios cadastrados");
            System.out.println("2 - Calcular impostos");
            System.out.println("3 - Voltar para o menu principal");
            System.out.println("4 - Sair\n");
            System.out.println("\n-------------------\n");
            System.out.print("");
            int opcao = leitorMenuSalariosEImpostos.nextInt();

                if(opcao == 1){
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

                    System.out.println("\n-------OPÇÕES-------\n");
                    System.out.println("1 - Calcular impostos");
                    System.out.println("2 - Voltar para o menu de salarios e impostos");
                    System.out.println("3 - Voltar para o menu principal");
                    System.out.println("4 - Sair\n");
                    System.out.println("\n-------------------\n");
                    System.out.print("");
                    int opcao2 = leitorMenuSalariosEImpostos.nextInt();

                        if (opcao2 == 1) {
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

                            System.out.println("\n-------OPÇÕES-------\n");
                            System.out.println("1 - Voltar para o menu de salarios e impostos");
                            System.out.println("2 - Voltar para o menu principal");
                            System.out.println("3 - Sair\n");
                            System.out.println("\n-------------------\n");
                            System.out.print("");
                            int opcao3 = leitorMenuSalariosEImpostos.nextInt();
                            
                            if (opcao3 == 1) {
                                menuSalariosEImpostos();
                            } else if (opcao3 == 2) {
                                menuPrincipal();
                            } else {
                                System.exit(0);
                            }
                        } else if (opcao2 == 2) {
                            menuSalariosEImpostos();
                        } else if (opcao2 == 3) {
                            menuPrincipal();
                        } else {
                            System.exit(0);
                        }

                } else if (opcao == 2) {
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

                            System.out.println("\n-------OPÇÕES-------\n");
                            System.out.println("1 - Voltar para o menu de salarios e impostos");
                            System.out.println("2 - Voltar para o menu principal");
                            System.out.println("3 - Sair\n");
                            System.out.println("\n-------------------\n");
                            System.out.print("");
                            int opcao2 = leitorMenuSalariosEImpostos.nextInt();
                            
                            if (opcao2 == 1) {
                                menuSalariosEImpostos();
                            } else if (opcao2 == 2) {
                                menuPrincipal();
                            } else {
                                System.exit(0);
                            }
                } else if (opcao == 3) {
                    menuPrincipal();
                } else {
                    System.exit(0);
                }
        
        } else if (opcaoDesejada == 2) {
            menuPrincipal();
        } else {
            System.exit(0);
        }
    }
}