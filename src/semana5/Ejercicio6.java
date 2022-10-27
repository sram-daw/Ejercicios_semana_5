package semana5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputFloat = new Scanner(System.in);
        System.out.print("¿Qué operación desea hacer: suma, resta, multiplicación o división? ");
        String operacion = inputString.nextLine();
        float valor1;
        float valor2;
        if (operacion.equals("suma")) {
            System.out.print("Introduzca el primer sumando: ");
            valor1 = inputFloat.nextFloat();
            System.out.print("Introduzca el segundo sumando: ");
            valor2 = inputFloat.nextFloat();

            System.out.println("El resultado es " + sumar(valor1, valor2));
        } else if (operacion.equals("resta")) {
            System.out.print("Introduzca el minuendo: ");
            valor1 = inputFloat.nextFloat();
            System.out.print("Introduzca el sustraendo: ");
            valor2 = inputFloat.nextFloat();
            System.out.println("El resultado es " + restar(valor1, valor2));
        } else if (operacion.equals("multiplicacion") | operacion.equals("multiplicación")) {
            System.out.print("Introduzca el primer factor: ");
            valor1 = inputFloat.nextFloat();
            System.out.print("Introduzca el segundo factor: ");
            valor2 = inputFloat.nextFloat();
            System.out.println("El resultado es " + multiplicar(valor1, valor2));
        }else if (operacion.equals("division") | operacion.equals("división")) {
            System.out.print("Introduzca el dividendo: ");
            valor1 = inputFloat.nextFloat();
            System.out.print("Introduzca el divisor: ");
            valor2 = inputFloat.nextFloat();
            System.out.println("El resultado es " + dividir(valor1, valor2));
        }else{
            System.out.println("Por favor, introduzca una operación adecuada.");
        }
    }

    public static float sumar(float n1, float n2) {
        return n1 + n2;
    }

    public static float restar(float n1, float n2) {
        return n1 - n2;
    }

    public static float multiplicar(float n1, float n2) {
        return n1 * n2;

    }

    public static float dividir(float n1, float n2) {
        return n1 / n2;
    }
}
