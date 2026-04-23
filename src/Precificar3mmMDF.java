 import java.util.Scanner;

 public class Precificar3mmMDF {
        
 double altura;
 double comp;
 double area;
 double valorMetroQuadrado = 128.57;

     void definirTamanhos3mm (Scanner scan){
      
          
         System.out.println("Altura (em mm): ");
         this.altura = scan.nextDouble();

         System.out.println("Comprimento (em mm): ");
         this.comp = scan.nextDouble();

             double conversaoAlt = altura / 1000;
             double conversaoComp = comp / 1000;

                 this.area = conversaoAlt * conversaoComp;
                 System.out.printf("Área em m²: %.2f\n" , area);    
            
     } 

     void precificar3mm (){

         double preco = this.area * this.valorMetroQuadrado;
         System.out.printf("Valor do serviço foi de R$ %.2f cada\n" , preco); 
  
     } 

     
 } 
