package holadam;

import java.util.Scanner;

public class HolaDAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next();
        
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Hola " + nombre + "!");
        System.out.println("Tienes " + edad + " años!");
    }
}
 