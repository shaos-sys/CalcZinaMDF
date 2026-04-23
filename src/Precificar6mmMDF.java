 import java.util.Scanner;

 public class Precificar6mmMDF {

 double altura;
 double comp;
 double area;
 double valorMetroQuadrado = 143.32;

     void definirTamanhos6mm (Scanner scan){
                
         System.out.print("Altura (em mm): ");
         this.altura = scan.nextDouble();

         System.out.print("Comprimento (em mm): ");
         this.comp = scan.nextDouble();

             double conversaoAlt = altura / 1000;
             double conversaoComp = comp / 1000;

                 this.area = conversaoAlt * conversaoComp;
                 System.out.println("================");
                 System.out.printf("Área em m²: %.2f\n" , area);    
                 System.out.println("================");
     } 

     void precificar6mm (){

         double preco = this.area * this.valorMetroQuadrado;
         System.out.printf("Valor do serviço foi de R$ %.2f cada\n" , preco);

 }
}
