package semana5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un valor: ");
        int valorUsuario = input.nextInt();
        if (valorUsuario < 100) {
            boolean esPrimo = true;
            if (valorUsuario == 0 | valorUsuario == 1) {
                esPrimo = false;
            } else {
                for (int divisor = 2; divisor < valorUsuario; divisor++) {
                    if (valorUsuario % divisor == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            System.out.println("¿Es primo?: " + esPrimo);
        }
    }
}

