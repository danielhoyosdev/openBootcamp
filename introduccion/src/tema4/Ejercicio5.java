package tema4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes = 0;

        System.out.print("Dígite un mes: ");
        mes = Integer.parseInt(scanner.nextLine());

        switch (mes) {
            case 1: case 2: case 12:
                System.out.println("La estación del mes " + mes + " es INVIERNO");
                break;
            case 3: case 4: case 5:
                System.out.println("La estación del mes " + mes + " es PRIMAVERA");
                break;
            case 6: case 7: case 8:
                System.out.println("La estación del mes " + mes + " es VERANO");
                break;
            case 9: case 10: case 11:
                System.out.println("La estación del mes " + mes + " es OTOÑO");
                break;
            default:
                System.out.println("El mes ingresado es incorrecto");
        }
    }
}
