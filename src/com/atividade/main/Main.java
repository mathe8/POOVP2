package com.atividade.main;

import com.atividade.sistema.Usuario;

import java.util.Scanner;

public class Main {

    private final static String tituloSistema = "› Sistema de investimentos ‹";

    private static String nomeUsuario;
    private static Usuario usuarioSistema;

    public static void cadastrarUsuario(){
        Scanner input = new Scanner(System.in);

        final String fraseNome = "Informe como deseja ser chamado: ";

        System.out.println(tituloSistema);
        System.out.print(fraseNome);
        nomeUsuario = input.next();

        System.out.print("\n");
        System.out.print("Seu nome é: "+nomeUsuario);

        usuarioSistema = new Usuario("A");

        System.out.print("\n");
    }

    public static void cadastrarInvestimento(){
        Scanner input = new Scanner(System.in);

        System.out.print("\n1 • TesouroSELIC \n2 • CDB \n3 • LCI");
        System.out.print("\nDigite o tipo de investimento: ");
        Integer cadTipoInvestimento = input.nextInt();

        System.out.print("Digite o nome da instituição financeira: ");
        String cadIntistuicaoFinaceira = input.next();

        System.out.print("Digite o valor que deseja aplicar: ");
        Double cadValorAplicado = input.nextDouble();

        System.out.print("Digite a taxa de rendimento ao mês: ");
        Double cadTaxaDeRendimentoAoMes = input.nextDouble();

        usuarioSistema.adicionarInvestimento(cadTipoInvestimento, cadIntistuicaoFinaceira, cadValorAplicado, cadTaxaDeRendimentoAoMes);

        System.out.println("\nCadastro de investimento realizado com sucesso!\n");
        painelInicial();
    }

    public static void exibirLucros(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nInforme o número do investimento que deseja visualizar: ");
        Integer numInvestimento = input.nextInt();

        System.out.println("Valor Aplicado:......"+ usuarioSistema.selecionarInvestimento(numInvestimento).getValorAplicado());
        System.out.println("Rendimento:.........."+ usuarioSistema.selecionarInvestimento(numInvestimento).calcularRendimento());
        System.out.println("Lucro:..............."+ usuarioSistema.selecionarInvestimento(numInvestimento).calcularLucro());

        System.out.print("\nExibição realizada com sucesso!\n");
        painelInicial();
    }

    public static void painelInicial(){
        Scanner input = new Scanner(System.in);

        final String[] opcoes =  {"Cadastrar Investimento", "Exibir Lucros", "Sair"};

        System.out.println("› Olá, "+nomeUsuario+" ‹");

        for(int i=0; i<opcoes.length; i++) {
            System.out.print(i+1+" • ");
            System.out.println(opcoes[i]);
        }

        System.out.print("\n");
        System.out.print("Selecionar opção: ");
        int opcaoNum = input.nextInt();
        System.out.print("Você selecionou a opção: "+ opcaoNum);

        switch (opcaoNum) {
            case 1:
                System.out.print("\nVocê selecionou Cadastrar Investimento.\n");
                cadastrarInvestimento();
                break;

            case 2:
                System.out.print("\nVocê selecionou Exibir Lucros.\n");
                exibirLucros();
                break;

            case 3:
                System.out.print("\nAté logo!\n");
                System.exit(0);

            default:
                System.out.print("\nOpção inválida!\n\n");
                painelInicial();
                break;
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        cadastrarUsuario();
        painelInicial();
    }
}
