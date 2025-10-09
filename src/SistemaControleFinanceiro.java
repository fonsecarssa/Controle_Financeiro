import java.util.Scanner;


public class SistemaControleFinanceiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoAtual = 15000;
        String tipoGasto;
        double valorGasto;
        String tipoReceita;
        double valorReceita;

        System.out.println("SISTEMA DE CONTROLE FINANCEIRO");
        System.out.println("PRESSIONE ENTER PARA CONTINUAR");

        input.nextLine();

        int opcao;

        do {
            System.out.println("========CONTROLE FINANCEIRO===========");
            System.out.println("[1] REGISTRAR GASTOS");
            System.out.println("[2] REGISTRAR RECEITA");
            System.out.println("[3] VER SALDO");
            System.out.println("[4] SAIR");
            System.out.println("Digite sua opção: ");

            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 4){
                System.out.println("ATÉ BREVE!");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Insira o tipo do gasto: (ESSENCIAIS, SUPÉRFLUOS)");
                    tipoGasto = input.nextLine().toUpperCase();
                    System.out.println("Insira o valor :");
                    valorGasto = input.nextDouble();
                    input.nextLine();
                    if (saldoAtual >= valorGasto) {
                        saldoAtual = saldoAtual - valorGasto;
                        System.out.println("INSERIDO COM SUCESSO!");
                    }else{
                        System.out.println("ERRO: Saldo insuficiente para realizar este gasto.");
                    }
                    break;
                case 2:
                    System.out.println("Insira a receita: (SALÁRIO, RENDAS EXTRAS, INVESTIMENTOS)");
                    tipoReceita = input.nextLine().toUpperCase();
                    System.out.println("Insira o valor: ");
                    valorReceita = input.nextDouble();
                    input.nextLine();
                    saldo += valorReceita;
                    System.out.println("Receita inserida com sucesso: " + tipoReceita + " ->  VALOR: R$ " + valorReceita);
                    break;
                case 3:
                    if (saldoAtual < 0){
                        System.out.println("🚨 ATENÇÃO! Saldo negativo: R$ " + saldoAtual);

                    }else if (saldoAtual == 0){
                        System.out.println("Saldo zerado: R$" + saldoAtual);
                    } else{
                        System.out.println("✅ Saldo Atual: R$ "+ saldoAtual);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 4);


    }
}
