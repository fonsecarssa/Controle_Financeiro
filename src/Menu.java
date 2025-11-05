import java.util.Scanner;


public class Menu {
  Scanner scanner = new Scanner(System.in);


  public void exibirMenu(){
      System.out.println("-----SCG BANK-----");
      System.out.println("[1] ADICIONAR RECEITA");
      System.out.println("[2] ADICIONAR GASTO");
      System.out.println("[3] VERIFICAR SALDO");
      System.out.println("[4] VERIFICAR TRANSAÇÕES");
  }

  private final int MAX_OPT = 4;

  public int readOption(){
      int userOption;
      do{
          System.out.println("Selecione sua opção: ");
          userOption = scanner.nextInt();

          if (userOption < 1 || userOption > MAX_OPT ){
              System.out.println("Opção inválida! Por favor, digite um número entre 1 e " + MAX_OPT);
          }
      } while (userOption < 1 || userOption > MAX_OPT);

      scanner.nextLine();

      System.out.println("Processando dados....");

      return userOption;
  }

  public double readValue(){
      System.out.println("Digite um valor: ");
      double userValue = scanner.nextDouble();
      scanner.nextLine();
      return userValue;
      }

      public String readDescription(){
          System.out.println("Insira a descrição: ");
          String userDesc = scanner.toString();

          return userDesc;
      }
  }





