
package Calculadora;

import java.util.Scanner;


public class calculadora {

   
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        
        menu();
        int cal= Scanner.nextInt();
        int resultados=0;
        
    System.out.println("ingrese num 1");
     int num1= Scanner.nextInt();
     
    System.out.println("ingrese num 2");
     int num2= Scanner.nextInt();
     
      
      
     
     switch (cal) {
        case 1 :
          System.out.println("la suma es:" +(resultados =num1 + num2));
          break;
        
        case 2 :
          System.out.println("la resta es:" +(resultados = num1 - num2));
          break;
        
        case 3 :
          System.out.println("la multiplicacion es:" +(resultados = num1 * num2));
          break;
          
        case 4 :
          System.out.println("la division es:" +(resultados = num1 / num2));
          break;
            
                   
    }
   
    
    }
    public static void menu(){
         System.out.println("¿Que operacion desea hacer?");
         System.out.println("1 suma");
         System.out.println("2 resta");
         System.out.println("3 multiplicacion");
         System.out.println("4 division");
        
    }

}
