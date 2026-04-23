import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {

     Scanner scan = new Scanner(System.in);   
     Precificar3mmMDF mdf3mm = new Precificar3mmMDF();
     Precificar6mmMDF mdf6mm = new Precificar6mmMDF();
            
     System.out.println("====== MENU ======");
     System.out.println("1. Definir medidas.");
     System.out.println("2. Ver preço.");
     System.out.println("3. Sair.");
     
     int opcao = 0;
     int tipoMDF = 0;
     
     System.out.print("Escolha uma opção: ");
     opcao = scan.nextInt();

     while (opcao != 3) {

         switch (opcao) {

             case 1: 
             System.out.println("====== DEFINIR MEDIDAS ======");
             System.out.println("Escolha o tipo do MDF");
             System.out.println("1. MDF de 3mm.");
             System.out.println("2. MDF de 6mm.");
             System.out.println("3. Voltar");
             System.out.print("Escolha: ");

               int submenu = scan.nextInt();

               while (submenu != 3) {
                                  
                     switch (submenu) {

                         case 1:
                         tipoMDF = 1;
                         System.out.println("====== MDF DE 3mm ======");
                         mdf3mm.definirTamanhos3mm(scan);
                         System.out.print("Digite 3 para voltar: ");
                         submenu = scan.nextInt();                         
                         break;

                           case 2:
                           tipoMDF = 2;
                           System.out.println("====== MDF DE 6mm ======");
                           mdf6mm.definirTamanhos6mm(scan); 
                           System.out.print("Digite 3 para voltar: ");
                           submenu = scan.nextInt();                                                        
                           break;
             
                     default:
                     System.out.println("Opção inválida.");
                     System.out.print("Escolha outra opção: ");
                     submenu = scan.nextInt();
                     break;

                      } // fim switch case tipoMDF                    
                     } // fim while tipoMDF

             System.out.println("===================");         
             System.out.println("1. Definir medidas.");
             System.out.println("2. Ver preço.");
             System.out.println("3. Sair.");
             System.out.print("Escolha uma opção: ");
             opcao = scan.nextInt();
             break;
            
             case 2:

                 System.out.println("====== PREÇO ======");

                 if (tipoMDF == 1) {
                 mdf3mm.precificar3mm();
                
                   } else if (tipoMDF == 2) {
                   mdf6mm.precificar6mm();

                     } else {
                      System.out.println("Escolha o tipo do MDF!");
                     }

                 System.out.println("===================");    
                 System.out.println("1. Definir medidas.");
                 System.out.println("2. Ver preço.");
                 System.out.println("3. Sair."); 
                 System.out.print("Escolha uma opção: ");
                 opcao = scan.nextInt();
                 break;
        
             default:
                 System.out.println("Opção inválida.");
                 System.out.print("Escolha uma opção: ");
                 opcao = scan.nextInt();
                 break;

      } // fim switch case opcao        
     } // fim while opcao

       if (opcao >=3 ) {
        System.out.println("Encerrando...");        
        }

       scan.close();

        }        
       } 
