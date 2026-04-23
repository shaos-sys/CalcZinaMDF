import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {

     Scanner scan = new Scanner(System.in);   
     Precificar3mmMDF mdf3mm = new Precificar3mmMDF();
            
     System.out.println("====== MENU ======");
     System.out.println("1. Definir medidas.");
     System.out.println("2. Ver preço.");
     System.out.println("3. Sair.");
     
     int opcao = 0;
     
     System.out.print("Escolha uma opção: ");
     opcao = scan.nextInt();

     while (opcao != 3) {

         switch (opcao) {

             case 1: 
             System.out.println("====== DEFINIR MEDIDAS ======");
             mdf3mm.definirTamanhos3mm(scan);
             System.out.print("Escolha uma opção: ");
             opcao = scan.nextInt();
             break;
            
             case 2:
               System.out.println("====== PREÇO ======");
               mdf3mm.precificar3mm();
               System.out.print("Escolha uma opção: ");
               opcao = scan.nextInt();
                break;
        
             default:
                 System.out.println("Opção inválida.");
                 System.out.print("Escolha uma opção: ");
                 opcao = scan.nextInt();
                 break;
      }         
     } 

       if (opcao >=3 ) {
        System.out.println("Encerrando...");        
        }

       scan.close();

        }        
       } 
