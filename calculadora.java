
package Calculadora;

import java.util.Scanner;


public class calculadora {

   
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        
        menu();
        int cal= Scanner.nextInt();
        int resultados=0;

        
    System.out.println("ingrese numero");
     int num1= Scanner.nextInt();


     
     switch (cal) {
        case 1 :
          System.out.println("ingrese num 2");
          int num2= Scanner.nextInt();
          System.out.println("la suma es:" +(resultados =num1 + num2));
          break;
        
        case 2 :
          System.out.println("ingrese num 2");
          num2= Scanner.nextInt();
          System.out.println("la resta es:" +(resultados = num1 - num2));
          break;
        
        case 3 :
           System.out.println("ingrese num 2");
           num2= Scanner.nextInt();
           System.out.println("la multiplicacion es:" +(resultados = num1 * num2));
           break;
          
        case 4 :
           System.out.println("ingrese num 2");
           num2= Scanner.nextInt();
            if (num2 !=0){
          System.out.println("la division es:" +(resultados = num1 / num2));
          break;
            }
            else {
                System.out.println("no se puede dividir por 0");
            }
            
        case 5:
            resultados =  (int) Math.sin(num1);
            System.out.println("el sin del numero es"+(resultados));
            break;
            
        case 6:
            resultados = (int) Math.cos(num1);
            System.out.println("el cos del numero es");
            break;
            
        case 7:
            resultados = (int) Math.tan(num1);
            System.out.println("la tan del numero es");
            break;
            
        case 8:
            System.out.println("indice de la raiz ");
            int in=Scanner.nextInt();
            System.out.println("radicado de la raiz ");
            //int num2=Scanner.nextInt();
            //resultados=  Math.pow(num1,1 / num2)
            System.out.println("la raiz es");
            break;
            
        case 9:
            System.out.println("numero del exponente");
            int expo=Scanner.nextInt();
            resultados= (int) Math.pow(num1, expo);
            System.out.println("la potencia del numero es"+(resultados));
            break;
            
        case 10:
            System.out.println("el iva es:");
            break;
            
            
            
    }
  
   
    
    }
    public static void menu(){
         System.out.println("¿Que operacion desea hacer?");
         System.out.println("1 suma");
         System.out.println("2 resta");
         System.out.println("3 multiplicacion");
         System.out.println("4 division");
         System.out.println("5 sin");
         System.out.println("6 cos");
         System.out.println("7 tan");
         System.out.println("8 raiz");
         System.out.println("9 potencia");
         System.out.println("10 IVA");
        
    }

}
