package holadam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HolaDAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next();
        
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        LocalDate fechaNacimiento = LocalDate.parse(
                scanner.next(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        System.out.printf("Hola %s!%n", nombre);
        System.out.printf("Tienes %s años!%n", edad);
        System.out.printf("Has nacido el %s%n", fechaNacimiento.format(
                DateTimeFormatter.ofPattern("eeee, dd 'de' MMMM 'de' yyyy")));
        
        System.out.println("Esto es un cambio!!!!!");
        System.out.println("Y esto otro.");
    }
}
