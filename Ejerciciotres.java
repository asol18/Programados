import java.util.Scanner;

public class EjercicioTres{
    public static void main(String[] args){
        int numero_1;
        int numero_2;
        int resultado;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numero_1= scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero_2= scanner.nextInt();
        resultado= numero_1+numero_2;
        System.out.println("El resultado de la suma es: " +resultado);
        resultado= numero_1 - numero_2;
        System.out.println("El resultado de la resta es: " +resultado);
        resultado= numero_1/numero_2;
        System.out.println("El resultado de la división es: " +resultado);
        resultado= numero_1*numero_2;
        System.out.println("El resultado de la multiplicación es: " +resultado);
    }
}