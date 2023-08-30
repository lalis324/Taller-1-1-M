
package Calculadora;

import java.util.Scanner;


public class metodoscal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que operacion desea hacer?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz");
        System.out.println("9. Potencia");
        System.out.println("10.  IVA");

        int cal = scanner.nextInt();
        double num1;

        if (cal >= 1 && cal <= 10) {
            System.out.print("Ingrese num 1: ");
            num1 = scanner.nextDouble();

            double result = 0;

            switch (cal) {
                case 1:
                    result = performSuma(num1);
                    break;
                case 2:
                    result = performResta(num1);
                    break;
                case 3:
                    result = performMultiplicacion(num1);
                    break;
                case 4:
                    result = performDivision(num1);
                    break;
                case 5:
                    result = calculateSin(num1);
                    break;
                case 6:
                    result = calculateCos(num1);
                    break;
                case 7:
                    result = calculateTan(num1);
                    break;
                case 8:
                    result = calculateRaiz(num1);
                    break;
                case 9:
                    result = calculatePotencia(num1);
                    break;
                case 10:
                    result = calculateIVA(num1);
                    break;
            }

            System.out.println("El resultado es: " + result);
        } else {
            System.out.println("Opcion no valida");
        }

        scanner.close();
    }

    public static double performSuma(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese num 2: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double performResta(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese num 2: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public static double performMultiplicacion(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese num 2: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public static double performDivision(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese num 2: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("No se puede dividir por 0");
            return 0;
        }
    }

    public static double calculateSin(double num1) {
        return Math.sin(num1);
    }

    public static double calculateCos(double num1) {
        return Math.cos(num1);
    }

    public static double calculateTan(double num1) {
        return Math.tan(num1);
    }

    public static double calculateRaiz(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el indice de la raiz: ");
        double num2 = scanner.nextDouble();
        return Math.pow(num1, 1 / num2);
    }

    public static double calculatePotencia(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el exponente: ");
        int expo = scanner.nextInt();
        return Math.pow(num1, expo);
    }

    public static double calculateIVA(double num1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el porcentaje del IVA: ");
        double num2 = scanner.nextDouble();
        return num1 * (num2 / 100);
    }


}

    

