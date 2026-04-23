 import java.util.Scanner;

 public class PrecificarMDF {
        
 double altura;
 double comp;
 double area;
 double valorMetroQuadrado;

     void definirTamanhos (Scanner scan){
                
         System.out.print("Altura (em mm): ");
         this.altura = scan.nextDouble();

         System.out.print("Comprimento (em mm): ");
         this.comp = scan.nextDouble();

             double conversaoAlt = altura / 1000;
             double conversaoComp = comp / 1000;

                 this.area = conversaoAlt * conversaoComp;

                  if (this.area == 0) {

                  System.out.println("ERRO: Área não pode ser igual a 0.");

                 } else {

                 System.out.println("================");
                 System.out.printf("Área em m²: %.3f\n" , area);    
                 System.out.println("================");
                 }
         } 

     void precificar (){

         double preco = this.area * this.valorMetroQuadrado;
         System.out.printf("Valor do serviço foi de R$ %.2f cada\n" , preco);  
         
  }      
 } 
