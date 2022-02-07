package tema4;

import java.util.Scanner;

public class Ejercicio1 {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIf;

        System.out.print("Digite un número: ");
        numeroIf = Integer.parseInt(scanner.nextLine());

        if(numeroIf == 0) {
            System.out.println("El número ingresado es 0");
        }else if(numeroIf > 0) {
            System.out.println("El número ingresado es positivo");
        }else{
            System.out.println("El número ingresado es negativo");
        }

    }
}
