import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){
        try (Scanner sc= new Scanner(System.in)){
            System.out.println("Ingrese un número: ");
            int num= sc.nextInt();

            while(num<= 0){
                System.out.println("Ingrese un número mayor a 0: ");
            }
            System.out.println("Ingrese otro número: ");
            int num2= sc.nextInt();

             while(num2<= 0){
                System.out.println("Ingrese un número mayor a 0: ")
            }
            if (num>num2){
                System.out.println(num + "es mayor que " + num2);
            }else if (num<num2){
                System.out.println(num + "es menor que" + num2);
            }else{
                System.out.println(num + "es igual a" + num2);
            }
        }
    }
}