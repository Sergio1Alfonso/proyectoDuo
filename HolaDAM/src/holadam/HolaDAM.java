package holadam;

import java.util.Scanner;

public class HolaDAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        String nombre = scanner.next();
        
        System.out.println("Hola " + nombre + "!");
    }
}
