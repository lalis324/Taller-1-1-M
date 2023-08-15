
package Calculadora;

import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
    menu();
    int cal= Scanner.nextInt();
    double resultados;

        
    System.out.println("ingrese numero:");
    double num1= Scanner.nextDouble();

     switch (cal) {
        case 1 :
           System.out.println("ingrese num 2:");
           double num2= Scanner.nextInt();
           System.out.println("la suma es:" +(resultados =num1 + num2));
           break;
        
        case 2 :
           System.out.println("ingrese num 2:");
           num2= Scanner.nextInt();
           System.out.println("la resta es:" +(resultados = num1 - num2));
           break;
        
        case 3 :
           System.out.println("ingrese num 2:");
           num2= Scanner.nextInt();
           System.out.println("la multiplicacion es:" +(resultados = num1 * num2));
           break;
          
        case 4 :
            System.out.println("ingrese num 2:");
            num2= Scanner.nextInt();
            if (num2 !=0){
            System.out.println("la division es:" +(resultados = num1 / num2));
            break;
            }
            else {
            System.out.println("no se puede dividir por 0:");
            }
            
        case 5:
            resultados = Math.sin(num1);
            System.out.println("el sin del numero es:"+(resultados));
            break;
            
        case 6:
            resultados = Math.cos(num1);
            System.out.println("el cos del numero es:"+resultados);
            break;
            
        case 7:
            resultados =  Math.tan(num1);
            System.out.println("la tan del numero es:"+resultados);
            break;
            
        case 8:
            System.out.println("numero del radical:");
            int raiz=Scanner.nextInt();
            resultados= (int) Math.pow(num1, 1/raiz);
            System.out.println("la raiz del numero es:"+(resultados));
            break;
            
        case 9:
            System.out.println("numero del exponente:");
            int expo=Scanner.nextInt();
            resultados= (int) Math.pow(num1, expo);
            System.out.println("la potencia del numero es:"+(resultados));
            break;
            
        case 10:
            System.out.println("numero para sacar el IVA:");
            int iva=Scanner.nextInt();
            System.out.println("Porcentaje el IVA:");
            int por=Scanner.nextInt();
            resultados= iva*(por/100);
            System.out.println("El IVA es:"+(resultados));
            break;       
    }

    }
    public static void menu(){
         System.out.println("¿Que operacion desea hacer?");
         System.out.println("1. Suma");
         System.out.println("2. Resta");
         System.out.println("3. Multiplicacion");
         System.out.println("4. Division");
         System.out.println("5. Sin");
         System.out.println("6. Cos");
         System.out.println("7. Tan");
         System.out.println("8. Raiz");
         System.out.println("9. Potencia");
         System.out.println("10. IVA");  
    }
}
