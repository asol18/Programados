import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese un número de 0 a 9999");
        int num= input.nextInt();
        while (num< 0 || num> 9999){
            System.out.println("Ingrese un número de 0 a 9999");
            num= input.nextInt();
        }
        if(num)
    }
    
}